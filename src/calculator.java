import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your blood mg/dL blood level: ");
        double mgPerDl = input.nextDouble();
        double mmolPerL = mgPerDl * 0.0555;

        if (mgPerDl<70) {
            System.out.println("Low Hypoglycemia: ");

        }else if (mgPerDl >= 70 && mgPerDl <= 99) {
            System.out.println("Normal: ");

        }else if (mgPerDl >= 100 && mgPerDl <= 125) {
            System.out.println("Prediabetes: ");

        } else if (mgPerDl>=126) {
            System.out.println("Diabetes: ");

        }
        System.out.printf("Blood glucose level: %.1f mg/dL%n", mgPerDl);
        System.out.printf("Converted level: %.2f mmol/L%n", mmolPerL);

        input.close();
    }

}
