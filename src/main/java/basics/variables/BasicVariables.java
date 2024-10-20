package basics.variables;

public class BasicVariables {
  public static void main(String[] args) {
    String title = "Basic String Variable";
    System.out.println(title);
    System.out.println("--------------------");
    final String finalVariable = "Final Variable helps to prevent overwrite value, you can declare as final.";
    final String constantVariable = "You can declare as constant as well.";
    System.out.println(finalVariable);
    System.out.println(constantVariable);
    String stringVariable, intVariable, floatVariable, booleanVariable, charVariable;
    stringVariable = intVariable = floatVariable = booleanVariable = charVariable = " is Valid variables";
    System.out.println("String" + stringVariable);
    System.out.println("Integer " + intVariable);
    System.out.println("Float" + floatVariable);
    System.out.println("Boolean" + booleanVariable);
    System.out.println("Char " + charVariable);
  }
}

// javac basics/variables/BasicVariables.java && java basics.variables.BasicVariables
