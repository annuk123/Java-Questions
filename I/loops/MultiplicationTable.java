public class MultiplicationTable {
    /** Main method */
    public static void main(String[] args) {
        // Display the table heading
        System.out.println("\nMultiplication Table");

        // Display the number title
        System.out.print("\n");
        for (int j = 1; j <= 9; j++)
            System.out.print("\t" + j); // Display numbers with proper spacing
        System.out.println("\n———————————————————————————————————————");

        // Display table body
        for (int i = 1; i <= 9; i++) { // Outer loop for rows
            System.out.print(i + " | "); // Display row number

            for (int j = 1; j <= 9; j++) { // Inner loop for columns
                // Display the product and align properly
                System.out.printf("%4d", i * j); // Display product with proper spacing
            }

            System.out.println(); // Move to the next line for the next row
        }
    }
}
