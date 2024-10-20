#!/bin/bash

# Create a base directory for documentation if it doesn't exist
mkdir -p docs

# Function to generate markdown for a directory
generate_markdown() {
  local dir_path=$1
  local md_file="$dir_path/index.md"

  # Create an index.md file for the current directory
  echo "# $(basename "$dir_path")" > "$md_file"
  echo "" >> "$md_file"
  
  # Loop through the contents of the directory
  for item in "$dir_path"/*; do
    if [[ -d "$item" ]]; then
      # If it's a directory, link to its index.md
      echo "- [$(basename "$item")](./$(basename "$item")/index.md)" >> "$md_file"
    elif [[ -f "$item" && "$item" == *.java ]]; then
      # If it's a .java file, include it in the index.md
      echo "- [$(basename "$item")](./$(basename "$item"))" >> "$md_file"
    fi
  done

  # Convert all .java files in the current directory to Markdown
  for java_file in "$dir_path"/*.java; do
    if [[ -f "$java_file" ]]; then
      local java_filename=$(basename "$java_file")
      local java_basename="${java_filename%.*}"
      local java_md_file="$dir_path/$java_basename.md"

      echo "```java" > "$java_md_file"  # Start Java code block
      cat "$java_file" >> "$java_md_file"  # Append Java code
      echo "```" >> "$java_md_file"  # End Java code block
      echo "- [$java_basename](./$java_basename.md)" >> "$md_file"  # Link to the .md file
    fi
  done
}

# Call the function for each top-level directory in src/main/java
for dir in src/main/java/*; do
  if [[ -d "$dir" ]]; then
    generate_markdown "$dir"
  fi
done

# Move generated markdown files to docs directory
mv src/main/java/*/index.md docs/
mv src/main/java/*/*.md docs/

echo "Documentation has been generated in the docs directory."
