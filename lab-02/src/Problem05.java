import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        int inC = scanner.nextInt();
        double inF = (inC * 9.0/5) + 32;
        System.out.printf("%d Celsius is %.1f Fahrenheit%n", inC, inF);
    }
}
