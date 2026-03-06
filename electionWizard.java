
import java.util.Scanner; // How we import a Scanner its use to let the user input a value to the Console or Terminal

public class electionWizard {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        int birthYear = input.nextInt(); // Here where the user input a value we create it by writing the following:
        // Data Type name method = Scanner name dot next keyword then Data type ();
        int votingYear = birthYear + 18;

        System.out.println("You'll be eligible to vote in the year: " + votingYear);
        // Here to get the value of votingYear we write it without quotations
        // if we do it will print it as a String

    }
}
