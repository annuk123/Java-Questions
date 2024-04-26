import java.util.InputMismatchException;
import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print(
                "What is " + number1 + " + " + number2 + "? ");
        int answer = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                answer = input.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                input.next(); // Clear the invalid input from the scanner
            }
        }
        while (number1 + number2 != answer) {
            System.out.print("Wrong answer. Try again. What is "
                    + number1 + " + " + number2 + "? ");
            validInput = false;
            while (!validInput) {
                try {
                    answer = input.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    input.next(); // Clear the invalid input from the scanner
                }
            }
        }
        System.out.println("You got it!");
    }
}
