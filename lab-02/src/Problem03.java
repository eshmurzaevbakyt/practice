import java.util.Scanner;
public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a four-digit integer: ");
        int num = scanner.nextInt();

        //TODO
        int first_digit = num / 1000;
        int second_digit = (num / 100) % 10;
        int third_digit = (num /10) % 10;
        int fourth_digit = num  % 10;
        int sum = first_digit + second_digit + third_digit + fourth_digit;
        System.out.printf("The sum of all digits is %d%n", sum);
    }
}
