package Loops;
import java.util.Scanner;
import java.util.Random;

public class MysteriousNumberGuesser {
    public static void main (String[] args){
    System.out.println("Welcome to the Mysterious Number Guesser!");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");
    Random random = new Random();
    int mysteriousNumber = random.nextInt(100) + 1;
    Scanner scanner = new Scanner(System.in);
    boolean guessedCorrectly = false;
        while (!guessedCorrectly) {
        System.out.print("Enter your guess: ");
        String userInput = scanner.nextLine();
        int userGuess = Integer.parseInt(userInput);
        if (userGuess == mysteriousNumber) {
            System.out.println("Congratulations! You guessed the mysterious number!");
            guessedCorrectly = true;
        } else {
            // Provide hints
            int difference = Math.abs(userGuess - mysteriousNumber);
            if (difference <= 10) {
                System.out.println("You're getting close!");
            } else {
                System.out.println("You're far away!");
            }
        }
    }


}
}

