package utils;

public class TextFormatter {
  public static void printRepeatedChar(char ch, int count) {
      System.out.println(String.valueOf(ch).repeat(count));
  }

  public static void printRepeatedString(String str, int count) {
      System.out.println(str.repeat(count));
  }

  public static String getRepeatedChar(char ch, int count) {
      return String.valueOf(ch).repeat(count);
  }

  public static String getRepeatedString(String str, int count) {
      return str.repeat(count);
  }

  // Dash-specific methods for backward compatibility
  public static void printDashes(int count) {
      printRepeatedChar('-', count);
  }

  public static String getDashes(int count) {
      return getRepeatedChar('-', count);
  }

}
