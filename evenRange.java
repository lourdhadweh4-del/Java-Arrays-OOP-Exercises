import java.util.*; //Creating a Scanner

public class evenRange {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in); // Creating a new Scanner object in memory
        System.out.println("Enter an integer number ");
        int n = in.nextInt(); // Is a variable declaration and assignment statement that calls a method from a Scanner object
        // Structure of it is: Data Type(int) Variable name(n) Assignment Operator (=) Method call (in) is your Scanner object dot nextInt() is a method of the Scanner class
        // It reads an integer value that the user types in form the keyboard
        // if the number is odd
        if ((n>=2 && n<=45) && n % 2 ==0) {
            // && is a logical "AND" used to combine two Boolean conditions
            // % modulus operator or mod used to give you the remainder
            // == equality operator used to compare two values to check if they are equal
            System.out.println("Not Weird");

        }
    }
}