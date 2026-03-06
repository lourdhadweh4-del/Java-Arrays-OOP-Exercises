import java.util.Scanner;
public class reversedNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a set of numbers ");

        int n = input.nextInt(); // Store the number to be reversed
        int r = 0; // Initialize reversed number to 0 (will build the reversed number here)
        // Loop continues until all digits are processed (when n becomes 0)
        while (n != 0) {
            int d = n % 10; // Extract the last digit (remainder when divided by 10)
            n = n / 10; // Remove the last digit from n (integer division drops decimal)
            r = r * 10 + d; // adds the extracted number to the last digit we had and then repeat the loop until all numbers are finished
            // Build reversed number: shift left and add extracted digit
        }
        System.out.println(r); // Print the final reversed number
    }

}
// Examples
// === Loop 1 ===
//int d = n % 10;     // d = 1234 % 10 = 4 (extract last digit)
//n = n / 10;         // n = 1234 / 10 = 123 (remove last digit)
//r = r * 10 + d;     // r = 0 * 10 + 4 = 4 (add 4 to reversed number)

// === Loop 2 ===
//int d = n % 10;     // d = 123 % 10 = 3 (extract last digit)
//n = n / 10;         // n = 123 / 10 = 12 (remove last digit)
//r = r * 10 + d;     // r = 4 * 10 + 3 = 43 (shift 4 left, add 3)