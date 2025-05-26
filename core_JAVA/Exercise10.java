Number Guessing Game:

import java.util.*;
public class GuessGame {
    public static void main(String[] args) {
        int num = new Random().nextInt(100) + 1, guess;
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("Guess: ");
            guess = s.nextInt();
            System.out.println(guess > num ? "Too high" : guess < num ? "Too low" : "Correct!");
        } while (guess != num);
    }
}