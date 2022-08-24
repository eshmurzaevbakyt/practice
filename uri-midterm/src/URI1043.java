import java.util.Scanner;
public class URI1043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double perimeter = a + b + c;
        double area = ((a + b) / 2) * c;
        if ((a < (b + c)) && (b < (a+c)) && (c< (a + b))) {
            System.out.printf("Perimetro = %.1f%n", perimeter);
        } else {
            System.out.printf("Area = %.1f%n", area);
        }
    }
}
