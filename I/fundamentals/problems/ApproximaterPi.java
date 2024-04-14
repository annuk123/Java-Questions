public class ApproximaterPi {

    public static void main(String[] args) {
        // calculate the first pi
        double pi_i = 4 * (1 -((1.0/5) + (1.0/5) + (1.0/7) + (1.0/9) + (1.0/11)));
        // calcuate the second pi
        double pi_ii = 4 * (1 -((1.0/5) + (1.0/5) + (1.0/7) + (1.0/9) + (1.0/11) + (1.0/13)));

        // output
        System.out.println("PI with six terms: " + pi_i);
        System.out.println("PI with seven terms: " + pi_ii);
    }
}