import java.util.Scanner;
public class URI1042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int t1 = 0;
        int t2 = 0;
        int t3 = 0;

        if (n1 < n2 && n1 < n3) {
            t1 = n1;
        } else if (n1 > n2 && n1 > n3) {
            t3 = n1;
        } else {
            t2 = n1;
        }

        if (n2 < n1 && n2 < n3) {
            t1 = n2;
        } else if (n2 > n1 && n2 > n3) {
            t3 = n2;
        } else {
            t2 = n2;
        }

        if (n3 < n2 && n3 < n1) {
            t1 = n3;
        } else if (n3 > n2 && n3 > n1) {
            t3 = n3;
        } else {
            t2 = n3;
        }

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
