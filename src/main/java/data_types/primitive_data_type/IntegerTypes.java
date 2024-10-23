package data_types.primitive_data_type;

public class IntegerTypes {
  public static void main(String[] args) {
    byte a = 100; // byte datatype stores number from -128 to 127
    short b = 5000; // The short datatype can store numbers from -32768 to 32767:
    int c = 10000; // The int datatype can store numbers from -2147483648 to 2147483647.
    long d = 150000000L; // The long datatype can store numbers from -9223372036854775808 to
                         // 9223372036854775807. Note that you should end the value with an "L"
    System.out.println("This number is stored in byte:" +a);
    System.out.println("This number is stored in short:" +b);
    System.out.println("This number is stored in int:" +c);
    System.out.println("This number is stored in long:" +d);
  }

}

//javac data_types/primitive_datatype/IntegerTypes.java && java data_types.primitive_datatype.IntegerTypes
