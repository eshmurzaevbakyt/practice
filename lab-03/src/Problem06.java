import java.util.Scanner;
public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double descr = (Math.pow(b, 2) - (4*a*c));
        double R1, R2;
        R1 = (-b + Math.pow(descr, 0.5)) / (2*a);
        R2 = (-b - Math.pow(descr, 0.5)) / (2*a);
        if (descr > 0) {
            System.out.printf("The equation has two roots %f and %f%n", R1, R2);
        } else if (descr == 0) {
            System.out.printf("The equation has one root %f", R1);
        } else if (descr < 0) {
            System.out.println("The equation has no real roots");
        }
    }
}
