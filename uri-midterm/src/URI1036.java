import java.util.Scanner;
public class URI1036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double R1;
        double R2;
        double disc = Math.pow(B,2) - (4*A*C);

        if (A == 0) {
            System.out.println("Impossivel calcular");
        } else if (disc < 0) {
            System.out.println("Impossivel calcular");
        } else {
            R1 = (-B + Math.pow(disc, 0.5)) / (2*A);
            R2 = (-B - Math.pow(disc, 0.5)) / (2*A);
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }
    }
}
