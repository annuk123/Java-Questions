import java.util.Scanner;
public class ComputeChange {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Recevie the amount
        System.out.print("Enter an amount in Double: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        //Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        //Find the number of Quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        //find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        //find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        //find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        //Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quaters");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " Pennies");

    }
}
