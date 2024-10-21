package basics.statements.loop;
public class For{
  public static void main(String[] args) {
    //Printing string for 5 times using for loop
  for(int i=1;i<=5;i=i+1){
    System.out.println("Java");
}
  //Print even numbers
  for(int i=1;i<=10;i=i+1){
   if(i%2==0){
      System.out.println(i);
  }
}
  }
}

//javac basics/statements/loop/For.java && java basics.statements.loop.For