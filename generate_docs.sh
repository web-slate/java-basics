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

    # Function to convert underscore_case back to Title Case
    convert_to_title_case() {
        echo "$1" | sed -E 's/_/ /g' | awk '{for(i=1;i<=NF;i++) $i=toupper(substr($i,1,1)) substr($i,2); print}'
    }

    # Start with the title and basic content
    echo "# $(convert_to_title_case "$(basename "$dir")")" > "$md_file"
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

    # Function to convert PascalCase to underscore_case
    convert_to_underscore() {
        echo "$1" | sed -E 's/([a-z])([A-Z])/\1_\2/g' | tr '[:upper:]' '[:lower:]'
    }

    # Add links to index.md for each .java file in the directory
    for java_file in "$dir"/*.java; do
        if [[ -f "$java_file" ]]; then
            local file_name=$(basename "$java_file")
            local link_name=$(convert_to_underscore "${file_name%.java}").md  # Convert filename to underscore_case and change extension to .md
            echo "- [$link_name](./$link_name)" >> "$md_file"

            # Create a Markdown file for the Java file with syntax highlighting
            {
                echo "## $file_name"
                echo '```java'
                cat "$java_file"
                echo -e '\n```'
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
            
            # Check if the subdirectory has any Java files before adding a link.
            if compgen -G "$subdir/*.java" > /dev/null || [[ -f "$subdir/index.md" ]]; then
                local subdir_name=$(basename "$subdir")
                echo "- [$subdir_name](./$subdir_name/index.html)" >> "$md_file"
            fi
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
site_url: 'https://web-slate.github.io/java-basics/'
theme:
  name: material  # Use a theme that supports sidebar navigation.
  features:
    - navigation.sections  # Enable sections in the sidebar.
    - navigation.footer  # Enable footer navigation for next/previous links.
    - search.suggest       # Enable search suggestions.
    - search.highlight      # Enable highlighting of search terms.
    - search.share          # Enable sharing of search results.

plugins:
  - search
  - gen_nav:
      enabled: true
nav:
  - Basics: basics/introduction.md               # Link to Basics section
  - Data Types: data_types/introduction.md        # Link to Data Types section
  - Methods: basics/methods/introduction.md        # Link to Methods section
  - Recursions: basics/recursions/introduction.md        # Link to Recursion section
  - Data Structures: data_structures/introduction.md  # Link to Data Structures section
  - OOPs: oops/introduction.md                     # Link to OOPs section
  - Algorithms: algorithms/introduction.md         # Link to Algorithms section
  - Leet Code: leet_code/introduction.md         # Link to Leet Code section
EOF

# Correct specific paths in mkdocs.yml (make sure this is valid).
sed -i '' 's|docs/src/main/java/docs|docs|g' mkdocs.yml || true 

echo "Generated mkdocs.yml for MkDocs."
