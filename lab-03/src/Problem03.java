import java.util.Scanner;
public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.printf("The first number %d is greater than the second number %d.%n", num1, num2);
        } else if ( num1 < num2) {
            System.out.printf("The second number %d is greater than the first number %d.%n", num2, num1);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
