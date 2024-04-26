import java.util.Scanner;

public class Palindrome {
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String s = input.nextLine(); // Input string

        // The index of the first character in the string
        int low = 0; // Low index
        // The index of the last character in the string
        int high = s.length() - 1; // High index

        boolean isPalindrome = true;

        // Check if the string is a palindrome
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }

            // Update indices
            low++;
            high--;
        }

        // Display the result
        if (isPalindrome)
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");
    }
}
