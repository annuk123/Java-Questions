import java.util.Scanner;
public class SalesTax {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);

        //To assign a variable of the int type to a variable of the short or byte type, explicit
        //casting must be used. For example, the following statements have a compile error:
        //int i = 1;
        //byte b = i; // Error because explicit casting is required


//However, so long as the integer literal is within the permissible range of the target variable, explicit casting is not needed to assign an integer literal to a variable of the short
//or byte type


        //int sum = 0;
        //sum += 4.5; // sum becomes 4 after this statement
        //sum += 4.5 is equivalent to sum = (int)(sum + 4.5).

        //Casting does not change the variable being cast. For example, d is not changed after
        //casting in the following code:
        //double d = 4.5;
        //int i = (int)d; // i becomes 4, but d is still 4.5

//        Casting is necessary if you are assigning a value to a variable of a smaller type range,
//                such as assigning a double value to an int variable. A compile error will occur if casting is not used in situations of this kind. However, be careful when using casting, as loss
//        of information might lead to inaccurate results.
    }


}
