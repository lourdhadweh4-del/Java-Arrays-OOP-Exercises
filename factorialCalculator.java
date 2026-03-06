import java.util.Scanner;
public class factorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int i = input.nextInt();
        int r = 1;
        // Calculate factorial using a loop
        while (i > 0) {  // Fixed condition
            r = r * i;
            i--;
        }

        System.out.println("Factorial: " + r);
        input.close(); // Method call (closes the Scanner object to free resources)
        //input is the object Scanner
        //dot operator used to access methods of an object
        // close () method name
        // () required for method calls, even with no parameters
        // ; semicolon ends the statement
    }
}

// To compute factorial of a number n
// n! = n × (n-1) × (n-2) × ... × 2 × 1
// Example: 5! = 5 × 4 × 3 × 2 × 1 = 120