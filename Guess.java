import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generate a random number
        int randomNumber = (int) (Math.random() * 100);

        // Prompt the user to guess the number
        System.out.println("Guess a number between 1 and 100: ");
        int guess = scanner.nextInt();

        // Loop until the user guesses the correct number
        while (guess != randomNumber) {
            if (guess < randomNumber) {
                System.out.println("Your guess is too low. Guess again: ");
            } else {
                System.out.println("Your guess is too high. Guess again: ");
            }
            guess = scanner.nextInt();
        }

        // If the user guesses the correct number, print "Congratulations!"
        System.out.println("Congratulations! You guessed the correct number!");
    }
}
