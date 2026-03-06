import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number: ");
        String n = input.nextLine();
        String y = "";
        int i = n.length() -1;
        while (i>=0) {
            y = y + n.charAt(i);
            i--;
        }
        System.out.println(y);
    }
}
