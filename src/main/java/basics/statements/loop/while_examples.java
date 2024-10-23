package basics.statements.loop;
public class while_examples{
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
//javac basics/statements/loop/while_examples.java && java basics.statements.loop.while_examples