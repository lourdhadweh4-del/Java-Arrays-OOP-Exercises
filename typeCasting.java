import java.util.Scanner;
public class typeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //create Scanner
        //ask user for a decimal num
        System.out.println("Enter a floating-point value: ");
        double x = input.nextDouble(); // Here the x is double number
        int y = (int) x; // (int) we call this as a type of casting operator
        // It casts or converts the x value from double to int when casting to int we drop out the decimal points
        System.out.println("Original value x: " + x);
        System.out.println("After casting to int, y " + y);
        byte z = (byte)x; //casting to a byte
        System.out.println("Original x: " + x);
        System.out.println("After cast to byte,z: " +z);
        input.close();





    }
}
