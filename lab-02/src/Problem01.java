import java.util.Scanner;
public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st value: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the 2nd value: ");
        int num2 = scanner.nextInt();
        System.out.printf("Before swapping: a = %d; b = %d;%n", num1, num2);

        //TODO
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.printf("After swapping: a = %d; b = %d;%n", num1, num2);
    }
}
