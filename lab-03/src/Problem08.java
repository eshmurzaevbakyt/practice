import java.util.Scanner;
public class Problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three integer numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int t1 = 0;
        int t2 = 0;
        int t3 = 0;
        if (num1 < num2 && num1 < num3) {
            t1 = num1;
        } else if (num1 > num2 && num1 > num3) {
            t3 = num1;
        } else {
            t2 = num1;
        }

        if (num2 < num1 && num2 < num3) {
            t1 = num2;
        } else if (num2 > num1 && num2 > num3) {
            t3 = num2;
        } else {
            t2 = num2;
        }

        if (num3 < num1 && num3 < num2) {
            t1 = num3;
        } else if (num3 > num1 && num3 > num2) {
            t3 = num3;
        } else {
            t2 = num3;
        }
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
