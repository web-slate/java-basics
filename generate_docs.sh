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
    local md_file="$OUTPUT_DIR/$(basename "$dir").md"

    # Create an index.md for the current directory
    echo "# $(basename "$dir")" > "$md_file"
    echo "" >> "$md_file"

    # Add links to index.md for each .java file in the directory
    for java_file in "$dir"/*.java; do
        if [[ -f "$java_file" ]]; then
            local file_name=$(basename "$java_file")
            echo "- [$file_name](./${file_name%.java}.md)" >> "$md_file"

            # Create a Markdown file for the Java file with syntax highlighting
            echo "```java" > "$OUTPUT_DIR/${file_name%.java}.md"
            cat "$java_file" >> "$OUTPUT_DIR/${file_name%.java}.md"
            echo "```" >> "$OUTPUT_DIR/${file_name%.java}.md"
        fi
    done

    # Recursively process subdirectories
    for subdir in "$dir"/*/; do
        if [[ -d "$subdir" ]]; then
            process_directory "$subdir"
        fi
    done
}

# Start processing from the root directory
process_directory "$ROOT_DIR"
