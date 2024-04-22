public class TestContinue {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        // Loop until number reaches 20
        while (number < 20) {
            number++;

            // Skip adding number to sum if it's equal to 10 or 11
            if (number == 10 || number == 11)
                continue;

            sum += number; // Add number to sum
        }

        // Display the result
        System.out.println("The sum is " + sum);
    }
}
