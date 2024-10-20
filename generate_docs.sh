#!/bin/bash

set -e  # Exit immediately if a command exits with a non-zero status.

# Define the root directory of your Java source files
ROOT_DIR="src/main/java"

# Define the output directory for Markdown files
OUTPUT_DIR="docs"

# Create the output directory if it doesn't exist
mkdir -p "$OUTPUT_DIR"

# Create the main index.md for the docs folder
cat <<EOF > "$OUTPUT_DIR/index.md"
# Webslate - Java Basics

Welcome to the Webslate documentation for Java Basics.

## Table of Contents
EOF

# Function to process each directory
process_directory() {
    local dir="$1"
    local relative_path="${dir#$ROOT_DIR/}"
    local output_dir="$OUTPUT_DIR/$relative_path"

    # Skip the root source directory itself
    if [[ "$dir" == "$ROOT_DIR" ]]; then
        return
    fi

    # Remove trailing slashes to prevent double slashes in paths
    output_dir="${output_dir%/}"

    # Create the output directory if it doesn't exist
    mkdir -p "$output_dir"

    # Create or merge an index.md for the current directory
    local md_file="$output_dir/index.md"

    # Start with the title and basic content
    echo "# $(basename "$dir")" > "$md_file"
    echo "" >> "$md_file"
    echo "This section covers $(basename "$dir")." >> "$md_file"
    echo "" >> "$md_file"

    # Check if the index.md already exists in the source and merge with existing content
    if [[ -f "$dir/index.md" ]]; then
        echo "Merging content from existing $dir/index.md into $md_file"
        cat "$dir/index.md" >> "$md_file"
        echo "" >> "$md_file"
    fi

    # Flag to track if any Java files were found
    local java_found=false

    # Add links to index.md for each .java file in the directory
    for java_file in "$dir"/*.java; do
        if [[ -f "$java_file" ]]; then
            local file_name=$(basename "$java_file")
            local link_name="${file_name%.java}.md"
            echo "- [$link_name](./$link_name)" >> "$md_file"

            # Create a Markdown file for the Java file with syntax highlighting
            {
                echo "## $link_name"
                echo '```java'
                cat "$java_file"
                echo '```'
            } > "$output_dir/$link_name"

            echo "Markdown file created: $output_dir/$link_name"
            java_found=true
        fi
    done

    # Only create index.md if Java files were found
    if ! $java_found; then
        rm "$md_file"  # Remove the empty index file
        echo "No Java files found in $dir, removed empty index.md"
    fi

    # Recursively process subdirectories
    for subdir in "$dir"/*/; do
        if [[ -d "$subdir" ]]; then
            process_directory "$subdir"
            # Add link to subdirectory in current index.md, linking to index.html.
            local subdir_name=$(basename "$subdir")
            echo "- [$subdir_name](./$subdir_name/index.html)" >> "$md_file"
        fi
    done

    # Copy existing .md files (like intro.md) to the output directory, excluding index.md.
    for existing_md in "$dir"/*.md; do
        if [[ -f "$existing_md" && "$(basename "$existing_md")" != "index.md" ]]; then
            cp "$existing_md" "$output_dir/"
            echo "Copied existing Markdown file: $output_dir/$(basename "$existing_md")"
        fi
    done

    # Add link to the main docs/index.md, linking to index.html.
    if [[ -n "$relative_path" ]]; then  # Check if relative_path is not empty.
        local dir_name=$(basename "$dir")
        echo "- [$dir_name](./$relative_path/index.html)" >> "$OUTPUT_DIR/index.md"
    fi
}

# Start processing from the root directory, skipping src/main/java itself.
for dir in $ROOT_DIR/*; do 
  if [[ -d $dir ]]; then 
      process_directory "$dir"
  fi 
done

# Create the mkdocs.yml file outside the docs directory with theme settings.
cat <<EOF > mkdocs.yml
site_name: 'Webslate - Java Basics'
theme:
  name: material  # Use a theme that supports sidebar navigation.
  features:
    - navigation.sections  # Enable sections in the sidebar.
    - navigation.expand  # Automatically expand sections in the sidebar.

nav:
  - Home: index.md
EOF

# Function to add navigation links hierarchically and fix broken links.
add_nav_links() {
    local dir="$1"
    local relative_path="${dir#$ROOT_DIR/}"

    # Add links for Java files and ensure correct naming.
    for java_file in "$dir"/*.java; do
        if [[ -f "$java_file" ]]; then
            local file_name=$(basename "$java_file")
            local link_name="${file_name%.java}.html"  # Change .md to .html here.
            echo "  - ${file_name%.java}: ${relative_path//\//\/}$link_name" >> mkdocs.yml  # Remove docs prefix and add .html extension.
        fi
    done

    # Add links for subdirectories.
    for subdir in "$dir"/*/; do
        if [[ -d "$subdir" ]]; then
            local subdir_name=$(basename "$subdir")
            echo "  - $subdir_name:" >> mkdocs.yml
            
            # Link to index.html instead of index.md and correct path issues.
            echo "    - index: /site/$subdir_name/index.html" >> mkdocs.yml
            
            add_nav_links "$subdir"
        fi
    done
    
}

# Add links to mkdocs.yml from each subdirectory of ROOT_DIR.
for dir in $ROOT_DIR/*; do 
  if [[ -d $dir ]]; then 
      add_nav_links "$dir"
  fi 
done

# Correct specific paths in mkdocs.yml (make sure this is valid).
sed -i '' 's|docs/src/main/java/docs|docs|g' mkdocs.yml || true 

echo "Generated mkdocs.yml for MkDocs."
