# String Methods

| Category   | Method                     | Description                                                                                  | Example                                |
|------------|----------------------------|----------------------------------------------------------------------------------------------|----------------------------------------|
| **Returns**   | `charAt()`                 | Returns the character at the specified index (position)                                     | `"Hello".charAt(1)` returns `'e'`     |
|            | `codePointAt()`            | Returns the Unicode of the character at the specified index                                  | `"Hello".codePointAt(1)` returns `101`|
|            | `codePointBefore()`        | Returns the Unicode of the character before the specified index                             | `"Hello".codePointBefore(1)` returns `72`|
|            | `codePointCount()`         | Returns the number of Unicode values found in a string.                                     | `"Hello".codePointCount(0, 5)` returns `5`|
|            | `hashCode()`               | Returns the hash code of a string                                                            | `"Hello".hashCode()` returns `69609650`|
|            | `length()`                 | Returns the length of a specified string                                                    | `"Hello".length()` returns `5`        |
|            | `isEmpty()`                | Checks whether a string is empty or not                                                      | `""isEmpty()` returns `true`          |
|            | `toCharArray()`            | Converts this string to a new character array                                               | `"Hello".toCharArray()` returns `['H', 'e', 'l', 'l', 'o']` |
|            | `toLowerCase()`            | Converts a string to lower case letters                                                      | `"Hello".toLowerCase()` returns `"hello"` |
|            | `toString()`               | Returns the value of a String object                                                         | `String.valueOf(123).toString()` returns `"123"` |
|            | `toUpperCase()`            | Converts a string to upper case letters                                                      | `"Hello".toUpperCase()` returns `"HELLO"` |
|            | `trim()`                   | Removes whitespace from both ends of a string                                                | `"  Hello  ".trim()` returns `"Hello"` |
|            | `valueOf()`                | Returns the string representation of the specified value                                     | `String.valueOf(123)` returns `"123"` |
| **Compares**   | `compareTo()`              | Compares two strings lexicographically                                                       | `"abc".compareTo("abd")` returns `-1` |
|            | `compareToIgnoreCase()`    | Compares two strings lexicographically, ignoring case differences                            | `"abc".compareToIgnoreCase("ABC")` returns `0` |
|            | `equals()`                 | Compares two strings. Returns true if the strings are equal, and false if not               | `"hello".equals("hello")` returns `true` |
|            | `equalsIgnoreCase()`       | Compares two strings, ignoring case considerations                                           | `"hello".equalsIgnoreCase("HELLO")` returns `true` |
|            | `regionMatches()`          | Tests if two string regions are equal                                                        | `"abcdef".regionMatches(0, "abc", 0, 3)` returns `true` |
| **Searches**   | `contains()`               | Checks whether a string contains a sequence of characters                                   | `"Hello".contains("ell")` returns `true` |
|            | `indexOf()`                | Returns the position of the first found occurrence of specified characters in a string      | `"Hello".indexOf("l")` returns `2`    |
|            | `lastIndexOf()`            | Returns the position of the last found occurrence of specified characters in a string       | `"Hello".lastIndexOf("l")` returns `3` |
|            | `matches()`                | Searches a string for a match against a regular expression, and returns the matches        | `"abc123".matches(".*\\d.*")` returns `true` |
| **Adds**       | `concat()`                 | Appends a string to the end of another string                                                | `"Hello".concat(" World")` returns `"Hello World"` |
|            | `join()`                   | Joins one or more strings with a specified separator                                          | `String.join(", ", "A", "B", "C")` returns `"A, B, C"` |
| **Removes**    | `replace()`                | Searches a string for a specified value, and returns a new string where the specified values are replaced | `"Hello".replace("l", "p")` returns `"Heppo"` |
|            | `replaceAll()`             | Replaces each substring of this string that matches the given regular expression with the given replacement | `"Hello".replaceAll("l", "p")` returns `"Heppo"` |
|            | `replaceFirst()`           | Replaces the first occurrence of a substring that matches the given regular expression with the given replacement | `"Hello".replaceFirst("l", "p")` returns `"Heplo"` |
|            | `split()`                  | Splits a string into an array of substrings                                                 | `"A,B,C".split(",")` returns `["A", "B", "C"]` |
|            | `subSequence()`            | Returns a new character sequence that is a subsequence of this sequence                      | `"Hello".subSequence(1, 4)` returns `"ell"` |
