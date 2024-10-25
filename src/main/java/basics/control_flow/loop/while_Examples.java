package basics.control_flow.loop;
public class While_Examples{
  //Print the number between 1-100 that are divisible by 3 and 5
  public static void main(String[] args) {
    int i = 1;

    while (i <= 100) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println(i);
        }
        i++; 
    }
}
}
//javac basics/statements/loop/While_Examples.java && java basics.statements.loop.While_Examples