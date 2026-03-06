import java.sql.SQLOutput;
import java.util.Scanner;
public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double num1;
        double num2;
        double result;
        do {
            System.out.println("1 , + ");
            System.out.println("2 , - ");
            System.out.println("3 , * ");
            System.out.println("4 , / ");
            System.out.println("5 , Exit");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Enter two numbers ");
                num1 = input.nextDouble();
                num2 = input.nextDouble();
                result = num1 + num2;
                System.out.println(result);

            } else if (choice == 2) {
                System.out.println("Enter two numbers ");
                num1 = input.nextDouble();
                num2 = input.nextDouble();
                result = num1 - num2;
                System.out.println(result);
            } else if (choice == 3) {
                System.out.println("Enter two numbers ");
                num1 = input.nextDouble();
                num2 = input.nextDouble();
                result = num1 * num2;
                System.out.println(result);

            } else if (choice == 4) {
                System.out.println("Enter two numbers ");
                num1 = input.nextDouble();
                num2 = input.nextDouble();
                result = num1 / num2;
                System.out.println(result);
            } else if (choice != 5) {
                System.out.println("invalid choice");

            }
        }   while (choice != 5);


    }
}


