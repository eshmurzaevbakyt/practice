import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();
        int amount = scanner.nextInt();
        if (code == 1) {
            double res;
            res = 4 * amount;
            System.out.printf("Total: R$ %.2f%n", res);
        } else if (code == 2) {
            double res;
            res = 4.5 * amount;
            System.out.printf("Total: R$ %.2f%n", res);
        } else if (code == 3) {
            double res;
            res = 5 * amount;
            System.out.printf("Total: R$ %.2f%n", res);
        } else if (code == 4) {
            double res;
            res = 2 * amount;
            System.out.printf("Total: R$ %.2f%n", res);
        } else if (code == 5) {
            double res;
            res = 1.5 * amount;
            System.out.printf("Total: R$ %.2f%n", res);
        }
    }
}
