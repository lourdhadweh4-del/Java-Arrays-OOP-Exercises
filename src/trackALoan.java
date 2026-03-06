import java.util.Scanner;
public class trackALoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Monthly payment: ");
        double monthlyPayment = input.nextDouble();
        double loanBalance = loanAmount;
        int i = 1;
        for (i = 1; i <= 12; i++) {
            loanBalance = loanBalance - monthlyPayment;

            if (loanBalance < 0) {
                loanBalance = 0;

            }
            System.out.println(i + " . " + loanBalance + "$");

            if (loanBalance == 0) {
                break;
            }
        }
        input.close();
    }
}
