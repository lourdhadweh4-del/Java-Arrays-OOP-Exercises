import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = input.nextInt();
        int y = 1;
        while (n>0) {
            y = y * n;
            n--;
        }
        System.out.println(y);

    }

}

