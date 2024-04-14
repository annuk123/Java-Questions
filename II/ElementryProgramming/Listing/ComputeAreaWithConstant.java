import java.util.Scanner; //Scanner is in the java.util package
public class ComputeAreaWithConstant {
    public static void main(String[] args){
        final double PI = 3.141519; //Declare a constant
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        //Compute area
        double area = radius * radius * PI;

        //Display result
        System.out.println("The area for circle of radius " + radius + " is " + area);
    }
}
