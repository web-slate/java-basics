package basics.control_flow;

//Use if to specify a block of code to be executed, if a specified condition is true
public class If {
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

// javac basics/statements/If.java && java basics.statements.If
