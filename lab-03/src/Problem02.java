import java.util.Scanner;
public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.printf("The number %d is even.%n", num);
        }
        else {
            System.out.printf("The number %d is odd.%n", num);
        }
    }
}
