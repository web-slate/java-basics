#!/bin/bash

# Base directory for Java files
base_dir="src/main/java"

# Function to create a markdown file
create_md_file() {
    local dir_path="$1"
    local file_name="$2"
    
    md_file="${dir_path}/${file_name}.md"
    
    if [ ! -f "$md_file" ]; then
        echo "# ${file_name}" > "$md_file"
        echo "" >> "$md_file"
        echo "## ${file_name} Implementation" >> "$md_file"
        echo "" >> "$md_file"
        echo "\`\`\`java" >> "$md_file"
        cat "${dir_path}/${file_name}.java" >> "$md_file"
        echo "\`\`\`" >> "$md_file"
        echo "Generated documentation for ${file_name}.java"
    else
        echo "Markdown file ${md_file} already exists. Skipping."
    fi
}

# Traverse directories and create Markdown files
for dir in $(find "$base_dir" -type d); do
    for java_file in "$dir"/*.java; do
        if [ -f "$java_file" ]; then
            filename=$(basename "$java_file" .java)
            create_md_file "$dir" "$filename"
        fi
    done
done

echo "Documentation generation complete."
