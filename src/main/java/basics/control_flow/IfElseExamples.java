package basics.control_flow;

//Else statement displays only when if statement is false
public class IfElseExamples{
  public static void main(String[] args) {
    int a = 10;
    int b = 5;
    if (a < b) {
      System.out.println("5 is greater"); //This condition is false
    }
    else{
      System.out.println("10 is greater"); 
    }
  }
}

//javac basics/control_flow/IfElseExamples.java && java basics.control_flow.IfElseExamples