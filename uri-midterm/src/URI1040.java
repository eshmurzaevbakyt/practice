import java.util.Scanner;
public class URI1040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n1 = scanner.nextFloat();
        float n2 = scanner.nextFloat();
        float n3 = scanner.nextFloat();
        float n4 = scanner.nextFloat();
        float n5 = scanner.nextFloat();
        float average = ((n1*2) + (n2*3) + (n3*4) + (n4*1)) / 10;
        System.out.printf("Media: %.1f%n", average);
        if (average >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (average < 5) {
            System.out.println("Aluno reprovado.");
        } else if (average >= 5 && average <= 6.9) {
            System.out.println("Aluno em exame.");
        }
        System.out.printf("Nota do exame: %.1f%n", n5);
        double newAverage = (average + n5) / 2;
        if (newAverage >= 5) {
            System.out.println("Aluno aprovado.");
        } else if (newAverage <= 4.9) {
            System.out.println("Aluno reprovado.");
        }
        System.out.printf("Media final: %.1f%n", newAverage);
    }
}
