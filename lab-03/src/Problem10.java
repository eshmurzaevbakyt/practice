import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double distance = Math.pow((Math.pow(num1, 2) + Math.pow(num2, 2)), 0.5);
        if (distance <= 10) {
            System.out.printf("Point (%.1f, %.1f) is in the circle%n", num1, num2);
        } else {
            System.out.printf("Point (%.1f, %.1f) is not in the circle%n", num1, num2);
        }
    }
}
