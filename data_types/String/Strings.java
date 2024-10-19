package data_types.String; 

public class Strings { 
    public static void main(String[] args) {
        
        String text = "My Favourite Program is Java"; 
        
        System.out.println("The length of this string: " + text.length());   // Print the length of the string
        System.out.println("UPPERCASED TEXT:"+ text.toUpperCase());//Print the string in Uppercase
        System.out.println("lowercased text:"+ text.toLowerCase()); //Print the string in Lowercase
        System.out.println(text.indexOf("P")); //Finding the index of Character in String
    }
}


 //Execute the below command
// javac data_types/String/Strings.java && java data_types.String.Strings