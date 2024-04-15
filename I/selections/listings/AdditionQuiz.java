import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        // generate number1
        int number1 = (int)(System.currentTimeMillis() % 10);

        // generate number2
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);

        // create a Scanner
        Scanner input = new Scanner(System.in);
        
        // show question
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        
        // get user input
        int answer = input.nextInt();
        
        // display result
        System.out.println(number1 + " + " + number2 + " = " + answer + " is " +
            (number1 + number2 == answer));
    }
}
