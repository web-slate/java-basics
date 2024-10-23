package basics.statements.conditional;

//Use if to specify a block of code to be executed, if a specified condition is true
public class if_example{
  public static void main(String[] args) {
    int a = 10;
    int b = 5;
    if (a > b) {
      System.out.println("10 is greater");
    }
    if (a < b) { //10 < 5 which is false
      System.out.println("This won't be printed because the statement is false");
    }
  }
}

// javac basics/statements/conditional/if_example.java && java basics.statements.conditional.if_example
