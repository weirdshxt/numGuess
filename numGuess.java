import java.util.Scanner;
import java.util.Random;

public class numGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Get range from user
        System.out.print("Enter the minimum number: ");
        int min = scanner.nextInt();
        System.out.print("Enter the maximum number: ");
        int max = scanner.nextInt();
        
        // Validate range
        while (max <= min) {
            System.out.println("Maximum must be greater than minimum. Please try again.");
            System.out.print("Enter the minimum number: ");
            min = scanner.nextInt();
            System.out.print("Enter the maximum number: ");
            max = scanner.nextInt();
        }
        
        int numberToGuess = random.nextInt(max - min + 1) + min;
        int numberOfTries = 0;
        int guess = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Guess a number between " + min + " and " + max + ":");

        while (!hasGuessedCorrectly) {
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < min || guess > max) {
                System.out.println("Please enter a number between " + min + " and " + max + ".");
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again:");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again:");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries.");
            }
        }

        scanner.close();
    }
}
