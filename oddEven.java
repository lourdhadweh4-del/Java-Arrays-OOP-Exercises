import java.util.*;
public class oddEven {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.println("Enter an integer number ");
        int n = in.nextInt(); // if the number is odd
        // Here the remainder when n is divided by 2 does not equal Zero that means it is an odd number
        // So it will print what is inside if statement which is Weird

        if (n % 2 != 0){
           System.out.println("Weird");
       }
    }
}
