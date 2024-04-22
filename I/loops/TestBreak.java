public class TestBreak {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        // Loop until the sum is greater than or equal to 100
        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100)
                break; // Exit the loop if the sum is greater than or equal to 100
        }

        // Display the result
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}
