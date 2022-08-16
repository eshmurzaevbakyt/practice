import java.util.Scanner;
public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        double points = scanner.nextDouble();
        if ((points >= 90) && (points <= 100)) {
            System.out.println("Grade: A");
        } else if ((points >= 80) && (points <= 90)) {
            System.out.println("Grade: B");
        } else if ((points >= 70) && (points <= 80)) {
            System.out.println("Grade: C");
        } else if ((points >= 60) && (points <= 70)) {
            System.out.println("Grade: D");
        } else if (points < 60){
            System.out.println("Grade: F");
        } else {
            System.out.printf("%.0f is not in the permitted range.%n", points);
        }
    }
}
