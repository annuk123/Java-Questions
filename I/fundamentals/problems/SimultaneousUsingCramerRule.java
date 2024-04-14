public class SimultaneousUsingCramerRule{

    public static void main(String[] args) {
        // linear equation
        System.out.println("\nSimultaneous Equation Using Cramer's rule.");
        System.out.println("3.4x + 50.2y = 44.5");
        System.out.println("2.1x + .55y = 5.9");

        // variables 
        double a = 3.4, b = 50.2, c = 2.1, d = 0.55, e = 44.5, f = 5.9;

        // formula for x and y.
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        // outputs
        System.out.println("");
        System.out.println("Value of X: " + x); // value of x
        System.out.println("Value of Y: " + y); // value of y
    }    
}