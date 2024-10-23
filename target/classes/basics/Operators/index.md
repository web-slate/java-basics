# Java Operatos
 Operators are used to perform operations on variables and values.

## Types of Operators
- Arithmetic operators
- Assignment operators
- Comparison operators
- Logical operators
- Bitwise operators

### Arithmetic Operators
Arithmetic operators are used to perform common mathematical operations.

| Operator | Name         | Description                         | Example  |
|----------|--------------|-------------------------------------|----------|
| +        | Addition     | Adds together two values            | x + y    |
| -        | Subtraction  | Subtracts one value from another    | x - y    |
| *        | Multiplication| Multiplies two values               | x * y    |
| /        | Division     | Divides one value by another        | x / y    |
| %        | Modulus      | Returns the division remainder      | x % y    |
| ++       | Increment    | Increases the value of a variable by 1 | ++x     |
| --       | Decrement    | Decreases the value of a variable by 1 | --x     |

#### Post-Increment/Decrement
Post-Increment (x++): The current value of x is used in the expression, and then x is incremented by 1.
Post-Decrement (x--): The current value of x is used in the expression, and then x is decremented by 1.

#### Pre-Increment/Decrement
Pre-Increment (++x): x is incremented by 1 first, and then the new value of x is used in the expression.
Pre-Decrement (--x): x is decremented by 1 first, and then the new value of x is used in the expression.

### Assignment Operators
Assignment operators are used to assign values to variables.
| Operator Name         | Operator | Example   | Same As       |
|-----------------------|----------|-----------|---------------|
| Assignment            | =        | x = 5     | x = 5         |
| Addition Assignment    | +=       | x += 3    | x = x + 3     |
| Subtraction Assignment | -=       | x -= 3    | x = x - 3     |
| Multiplication Assignment | *=    | x *= 3    | x = x * 3     |
| Division Assignment    | /=       | x /= 3    | x = x / 3     |
| Modulus Assignment     | %=       | x %= 3    | x = x % 3     |
| Bitwise AND Assignment | &=       | x &= 3    | x = x & 3     |
| Bitwise OR Assignment  | \|=      | x \|= 3   | x = x \| 3    |
| Bitwise XOR Assignment | ^=       | x ^= 3    | x = x ^ 3     |
| Right Shift Assignment | >>=      | x >>= 3   | x = x >> 3    |
| Left Shift Assignment  | <<=      | x <<= 3   | x = x << 3    |

### Comparison Operators
Comparison operators are used to compare two values.

| Name                         | Operator | Example  |
|------------------------------|----------|----------|
| Equal to                     | ==       | x == y   |
| Not equal                    | !=       | x != y   |
| Greater than                 | >        | x > y    |
| Less than                    | <        | x < y    |
| Greater than or equal to     | >=       | x >= y   |
| Less than or equal to        | <=       | x <= y   |

### Logical Operators
Logical operators are used to determine the logic between variables or values.

| Name         | Operator | Example                     | Alternative | Description                                   |
|--------------|----------|-----------------------------|-------------|-----------------------------------------------|
| Logical and  | &&       | x < 5 && x < 10             | AND         | Returns true if both statements are true      |
| Logical or   | \|\|     | x < 5 || x < 4              | OR          | Returns true if one of the statements is true |
| Logical not  | !        | !(x < 5 && x < 10)          | NOT         | Reverses the result, returns false if true    |

