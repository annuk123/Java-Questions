public class IncreDecre {
    public static void main(String[] args){
        //The increment operator(++) and decrement operator are for increment and decrementing a variable by I.
        int i = 10;
        int newNum = 10 * i++; //int newNum = 10 * i;  i = i + 1;
        System.out.println("i is " + i + " , newNum is " + newNum);

        int j = 10;
        int newNum2 = 10 * (++j);
        System.out.println("j is " + j + ", newNum2 is " + newNum2 );

        double x = 1.0;
        double y = 5.0;
        double z = --x + (++y);
        System.out.print(z);
    }
}
