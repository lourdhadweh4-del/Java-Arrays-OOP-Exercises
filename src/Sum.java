import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: " );
        int n = input.nextInt();
        int odd = 0;
        int even = 0;
        for (int i = 1; i<=n; i++) {
            if (i % 2 == 0) {
                even = even + i;
            } else {
                odd = odd + i;

            }

        }
        System.out.println("The even sum is: " + even);
        System.out.println("The odd sum is: " + odd);
    }
}
