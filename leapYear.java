import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a year ");
        int year = input.nextInt();
        if ( year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
            // Leap year check: (divisible by 4 AND NOT by 100) OR (divisible by 400)
            // Example 1: Year 2024
            // (2024 % 4 == 0 && 2024 % 100 != 0) || (2024 % 400 == 0)
            // (true && true) || (false)
            // true || false
            // = true (2024 IS a leap year)
            System.out.println("leap year");
        } else {
            // Example 2: Year 1900
            // (1900 % 4 == 0 && 1900 % 100 != 0) || (1900 % 400 == 0)
            // (true && false) || (false)
            // false || false
            // = false (1900 is NOT a leap year)
            System.out.println("not a leap year ");
        }

        input.close();
        //input is the object Scanner
        //dot operator used to access methods of an object
        // close () method name
        // () required for method calls, even with no parameters
        // ; semicolon ends the statement
    }
}

// When the year is divisible by 4 it is a leap year
