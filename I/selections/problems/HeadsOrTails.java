import java.util.Scanner;

public class HeadsOrTails {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // random number (0 or 1) representing heads or tails
        int random = (int) (Math.random() * 2);

        // user prompt to enter a guess (0 for heads, 1 for tails)
        System.out.print("Guess the result (0 for heads, 1 for tails): ");
        int guess = input.nextInt();

        // guess calculatios to check is correct 
        // or incorrect and display the result
        if (guess == random) {
            if (guess == 0) {
                System.out.println("Correct! The result is heads.");
            } else {
                System.out.println("Correct! The result is tails.");
            }
        } else {
            if (guess == 0) {
                System.out.println("Incorrect! The result is tails.");
            } else {
                System.out.println("Incorrect! The result is heads.");
            }
        }

        input.close(); // Close the Scanner object
    }
}
