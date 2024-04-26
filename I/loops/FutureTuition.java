public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000; // Initial tuition
        int year = 0; // Year counter

        // Calculate when tuition will double
        while (tuition < 20000) {
            tuition = tuition * 1.07; // Increase tuition by 7% each year
            year++; // Increment year counter
        }

        // Display the result
        System.out.println("Tuition will be doubled in " + year + " years");
        System.out.printf("Tuition will be $%.2f in %d years", tuition, year);
    }
}
