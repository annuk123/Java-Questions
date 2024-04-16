import java.util.Scanner;

public class pointPositions {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Create Scanner object
        //Prompt the user to enter the three points for p0, p1, and p2
        System.out.print("Enter three for p0, p1 and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Calculation point position
        double distance = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        System.out.print( "(" + x2 + ", " + y2 + ")" + " is on the " );

        if (distance > 0){
            System.out.println("left side of the line from (" + x0 + " , " + y0 + ") to " + "(" + x1 + ", " + y1 + ")");
        }
        if (distance == 0) {
            System.out.println("line from (" + x0 + " , " + y0 + ") to " + "(" + x1 + ", " + y1 + ")");

        }
        if (distance < 0){
            System.out.println("right side of the line from (" + x0 + " , " + y0 + ") to " + "(" + x1 + ", " + y1 + ")");

        }
    }
}