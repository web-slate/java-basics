# String Methods

| Category  | Method                    | Description                                                                                  | Return Type      |
|-----------|---------------------------|----------------------------------------------------------------------------------------------|------------------|
| **Returns**   | `charAt()`                | Returns the character at the specified index (position)                                     | `char`           |
|           | `codePointAt()`           | Returns the Unicode of the character at the specified index                                  | `int`            |
|           | `codePointBefore()`       | Returns the Unicode of the character before the specified index                             | `int`            |
|           | `codePointCount()`        | Returns the number of Unicode values found in a string.                                     | `int`            |
|           | `hashCode()`              | Returns the hash code of a string                                                            | `int`            |
|           | `length()`                | Returns the length of a specified string                                                    | `int`            |
|           | `isEmpty()`               | Checks whether a string is empty or not                                                      | `boolean`        |
|           | `toCharArray()`           | Converts this string to a new character array                                               | `char[]`        |
|           | `toLowerCase()`           | Converts a string to lower case letters                                                      | `String`         |
|           | `toString()`              | Returns the value of a String object                                                         | `String`         |
|           | `toUpperCase()`           | Converts a string to upper case letters                                                      | `String`         |
|           | `trim()`                  | Removes whitespace from both ends of a string                                                | `String`         |
|           | `valueOf()`               | Returns the string representation of the specified value                                     | `String`         |
| **Compares**   | `compareTo()`             | Compares two strings lexicographically                                                       | `int`            |
|           | `compareToIgnoreCase()`   | Compares two strings lexicographically, ignoring case differences                            | `int`            |
|           | `equals()`                | Compares two strings. Returns true if the strings are equal, and false if not               | `boolean`        |
|           | `equalsIgnoreCase()`      | Compares two strings, ignoring case considerations                                           | `boolean`        |
|           | `regionMatches()`         | Tests if two string regions are equal                                                        | `boolean`        |
| **Searches**   | `contains()`              | Checks whether a string contains a sequence of characters                                   | `boolean`        |
|           | `indexOf()`               | Returns the position of the first found occurrence of specified characters in a string      | `int`            |
|           | `lastIndexOf()`           | Returns the position of the last found occurrence of specified characters in a string       | `int`            |
|           | `matches()`               | Searches a string for a match against a regular expression, and returns the matches        | `boolean`        |
| **Adds**      | `concat()`                | Appends a string to the end of another string                                                | `String`         |
|           | `join()`                  | Joins one or more strings with a specified separator                                          | `String`         |
| **Removes**   | `replace()`               | Searches a string for a specified value, and returns a new string where the specified values are replaced | `String`         |
|           | `replaceAll()`            | Replaces each substring of this string that matches the given regular expression with the given replacement | `String`         |
|           | `replaceFirst()`          | Replaces the first occurrence of a substring that matches the given regular expression with the given replacement | `String`         |
|           | `split()`                 | Splits a string into an array of substrings                                                 | `String[]`       |
|           | `subSequence()`           | Returns a new character sequence that is a subsequence of this sequence                      | `CharSequence`   |
