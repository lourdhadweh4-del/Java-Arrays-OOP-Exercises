import java.util.*; // Another way to create a Scanner
public class ATM {
    public static void main(String[] args) { // Creating main method where the code is running
        System.out.println("ATM Menu \n 1.Check Balance \n 2.Deposit Money \n 3.Withdraw Money"); // \n means printing in a new line
        Scanner in = new Scanner (System.in); // Creating the Scanner Object
        int choice = in.nextInt(); // Is a method that allows the user to input a value
        double balance = 5000.65;
        double amount = 0.0;
if (choice==1){ // An If statement
    System.out.println("This is your balance: " + balance);

} else if (choice==2) {  // When the previous If statement is not True the code inside the else if runs
    System.out.println("Enter the amount you want to deposit");
    amount = in.nextDouble();
    balance = balance + amount;
    System.out.println(balance);

} else if (choice==3) { // The same when the previous else if is not True then this code runs
    System.out.println("Enter the amount to withdraw");
    amount = in.nextDouble();
    balance = balance - amount;
    System.out.println(balance);
} else {
    System.out.println("Please choose the right choice");
       }

    }

}

