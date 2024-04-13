import java.util.Scanner;
public class ScannersObject {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a byte value: ");
        byte byteValue = input.nextByte();

        System.out.print("Enter a short value: ");
        short shortValue = input.nextShort();

        System.out.print("Enter a int value: ");
        int intValue = input.nextInt();

        System.out.print("Enter a float value: ");
        long longValue = input.nextLong();

        System.out.print("Enter a float value: ");
        float floatValue = input.nextFloat();
    }

}
