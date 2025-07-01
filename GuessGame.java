import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random() * 100) + 1, guess, tries = 0;

        System.out.println("Guess a number between 1 and 100");
        while (true) {
            System.out.print("Enter guess: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input.");
                sc.next();
                continue;
            }
            guess = sc.nextInt();
            tries++;
            if (guess < num)
                System.out.println("Too low");
            else if (guess > num)
                System.out.println("Too high");
            else {
                System.out.println("Correct!");
                break;
            }
        }
        System.out.println("Tries: " + tries);
        sc.close();
    }
}
