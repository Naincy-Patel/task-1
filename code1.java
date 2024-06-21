import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attempts = 5;
        int score = 0;

        System.out.println("Welcome to  Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        boolean playAgain = true;
        while (playAgain) {
            int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("New round! You have " + attempts + " attempts.");

            for (int i = 1; i <= attempts; i++) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    score += attempts - (i - 1);
                    break;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                if (i == attempts) {
                    System.out.println("Out of attempts. The number was: " + generatedNumber);
                }
            }

            System.out.println("Your current score: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = scanner.next();
            playAgain = playChoice.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing! Your final score: " + score);
        scanner.close();
    }
}


