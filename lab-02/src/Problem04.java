import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter the length in inches: 17 17.00 in. = 43.18 cm.
        System.out.print("Enter the length in inches: ");
        double inch = scanner.nextInt();
        double inCM = inch * 2.54;
        System.out.printf("%.2f in. = %.2f cm.%n", inch, inCM);

    }
}
