import java.util.Scanner;
public class VendingMachineChange {
    public static void main(String[] args) {
        int amount,originalAmount,quarters, dimes, nickels, pennies;
        System.out.println("Enter a whole number from 1 to 99: ");
        Scanner keyboard = new Scanner(System.in);
        amount = keyboard.nextInt();
        originalAmount = amount;
        quarters = amount / 25;
        dimes = amount / 10;
        nickels = amount / 5;
        pennies = amount;
        System.out.println(originalAmount + "cents in coins can be given as: ");
        System.out.println(quarters + "quarters");
        System.out.println(dimes + "dimes");
        System.out.println(nickels + "nickels");
        System.out.println(pennies + "pennies");
    }
    }

