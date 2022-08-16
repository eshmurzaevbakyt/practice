import java.util.Scanner;
public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a real number: ");
        double num = scanner.nextDouble();
        double res = num;
        if (num < 0) {
            res *= -1;
        }
        System.out.printf("|%.3f| = %.3f%n", num, res);
    }
}
