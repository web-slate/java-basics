package data_types.primitive_datatype;

public class FloatTypes {
  public static void main(String[] args) {
    float a = 5.15f; // Float should end with value f
    double b = 12E4d; // Double should end with value d.
                      //A floating point number can also be a scientific number with an "e" to indicate the power of 10:
    System.out.println("This number is stored in Float:" + a);
    System.out.println("This number is stored in Double:" + b);
  }
}
//javac data_types/primitive_datatype/FloatTypes.java && java data_types.primitive_datatype.FloatTypes