import java.util.Scanner;
public class Problem09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int choice = scanner.nextInt();
        int computer = (int) (Math.random() * 3);
        System.out.print("The computer is ");
        switch (computer) {
            case 0: System.out.print("scissor."); break;
            case 1: System.out.print("rock."); break;
            case 2: System.out.print("paper.");
        }
        System.out.print(" You are ");
        switch (choice) {
            case 0: System.out.print("scissor"); break;
            case 1: System.out.print("rock"); break;
            case 2: System.out.print("paper");
        }
        if (choice == computer) {
            System.out.println(" too. It is a draw");
        }
        else {
            boolean victory = (choice == 0 && computer == 2) || (choice == 1 && computer == 0) || (choice == 2 && computer == 1);
            if (victory)
                System.out.println(". You won");
            else
                System.out.println(". You lost");
        }
    }
}
