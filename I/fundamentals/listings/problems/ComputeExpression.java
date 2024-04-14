package I.fundamentals.listings.problems;
public class ComputeExpression {

    public static void main(String[] args) {
        // expression
        System.out.println("Compute expression: \n");

        double expression = (9.5 * 4.5 - ( 2.5 * 3)) / (45.5 - 3.5);
        System.out.println("9.5 * 4.5 - 2.5 * 3\n" + // denominators
                        "------------------\n" + // division symbol
                        "   45.5 - 3.5"); // nominators

    System.out.println("\nvalue of the expression is: " + expression);
    }
}