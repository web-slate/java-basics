package data_types.non_primitive_data_type.fixed_array;

public class FixedArrayExample {

/**
* ## Fixed Array Example with Byte
 * 
 * > `listFixedByteArray` is iterating every byte value for each statement.
 * 
 */

  public static void main(String[] args) {
    FixedArrayExample fixedArrayExample = new FixedArrayExample();
    // fixedArrayExample.listFixedByteArray();
    fixedArrayExample.listFixedIntegerArray();
  }

  private void listFixedByteArray() {
    byte[] byteList = new byte[]{120,121,127};

    for(byte byteValue : byteList) {
      System.out.println("byteValue: " + byteValue);
    }
  }

  private void listFixedIntegerArray() {
    int[] integerList = new int[]{0,1,0,3,12};
    int index = 0;

    for(int num : integerList) {
      if (num != 0) {
        integerList[index++] = num;
        System.out.println(index++ + ": " + integerList[index++]);
      }
    }
  }
}


/**
 * Command to Run:  
 * 
```
javac data_types/non_primitive_data_type/fixed_array/FixedArrayExample.java && java data_types.non_primitive_data_type.fixed_array.FixedArrayExample
```
 */