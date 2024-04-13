import java.util.Scanner;
public class ComputeArea {
    public static void main(String[] args){
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        //prompt the user to enter a radius
        System.out.print("Enter a number for Radius: ");
        double radius = input.nextDouble();
        //Compute area
        double area = radius * radius * 3.1415;
        //Display results
        System.out.println("The area of the circle of radius " + "is " + area);
    }
}
