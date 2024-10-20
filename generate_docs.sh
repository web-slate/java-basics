#!/bin/bash

# Define the root directory of your Java source files
ROOT_DIR="src/main/java"

# Define the output directory for Markdown files
OUTPUT_DIR="docs"

# Create the output directory if it doesn't exist
mkdir -p "$OUTPUT_DIR"

# Function to process each directory
process_directory() {
    local dir="$1"
    local relative_path=${dir#$ROOT_DIR/}  # Get the relative path from the root directory

    # Create directories in the output path
    mkdir -p "$OUTPUT_DIR/$relative_path"

    # Create or merge an index.md for the current directory
    local md_file="$OUTPUT_DIR/$relative_path/index.md"  # Markdown file path

    # Start with the title and existing content if present
    echo "# $(basename "$dir")" > "$md_file"  # Start with the title
    echo "" >> "$md_file"  # Add a blank line

    # Check if the index.md already exists and merge with existing content
    if [[ -f "$dir/index.md" ]]; then
        echo "Merging content from existing $dir/index.md into $md_file"
        cat "$dir/index.md" >> "$md_file"
        echo "" >> "$md_file"  # Add a blank line after merging
    fi

    # Add links to index.md for each .java file in the directory
    for java_file in "$dir"/*.java; do
        if [[ -f "$java_file" ]]; then
            local file_name=$(basename "$java_file")
            local link_name=$(basename "$file_name" .java)
            # Fixing the link to avoid double slashes
            echo "- [$link_name](${relative_path}/${file_name%.java}.md)" >> "$md_file"

            # Create a Markdown file for the Java file with syntax highlighting
            {
                echo "## $link_name"  # Add title for the Java file
                echo '```java'  # Start the code block
                cat "$java_file"  # Add the contents of the Java file
                echo '```'  # End the code block
            } > "$OUTPUT_DIR/$relative_path/${file_name%.java}.md"

            echo "Markdown file created: $OUTPUT_DIR/$relative_path/${file_name%.java}.md"
        fi
    done

    # Recursively process subdirectories
    for subdir in "$dir"/*/; do
        if [[ -d "$subdir" ]]; then
            process_directory "$subdir"
        fi
    done

    # Copy existing .md files (like intro.md) to the output directory
    for existing_md in "$dir"/*.md; do
        if [[ -f "$existing_md" ]]; then
            cp "$existing_md" "$OUTPUT_DIR/$relative_path/"
            echo "Copied existing Markdown file: $OUTPUT_DIR/$relative_path/$(basename "$existing_md")"
        fi
    done

    # Merging links for all generated Markdown files to the index.md in the current directory
    for md_file in "$OUTPUT_DIR/$relative_path/"*.md; do
        if [[ -f "$md_file" && "$md_file" != "$OUTPUT_DIR/$relative_path/index.md" ]]; then
            local link_name=$(basename "$md_file" .md)
            # Ensure correct relative path for the link
            echo "- [$link_name](${relative_path}/$(basename "$md_file"))" >> "$OUTPUT_DIR/$relative_path/index.md"
        fi
    done
}

# Create the main index.md for the docs folder
echo "# Webslate - Java Basics" > "$OUTPUT_DIR/index.md"
echo "" >> "$OUTPUT_DIR/index.md"
echo "Welcome to the Webslate documentation for Java Basics." >> "$OUTPUT_DIR/index.md"
echo "" >> "$OUTPUT_DIR/index.md"

# Start processing from the root directory
process_directory "$ROOT_DIR"

# Create the _config.yml for GitHub Pages
cat <<EOF > "$OUTPUT_DIR/_config.yml"
title: "Webslate - Java Basics"
description: "A comprehensive guide to learning Java programming."
theme: minima
EOF

echo "Generated _config.yml for GitHub Pages."
echo "Generated docs/index.md for GitHub Pages."
