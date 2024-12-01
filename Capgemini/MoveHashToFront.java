package Capgemini;
import java.util.Scanner;

public class MoveHashToFront {

    // Method to move all '#' to the front of the string
    public static void moveHash(String str, int n) {
        String str1 = ""; // Initialize as an empty string
        String str2 = ""; // Initialize as an empty string

        // Iterate over the input string
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '#') {
                str1 = str1 + str.charAt(i); // Append '#' to str1
            } else {
                str2 = str2 + str.charAt(i); // Append other characters to str2
            }
        }

        // Combine and print the result
        System.out.println("Output: " + str1 + str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String a = sc.nextLine();
        int len = a.length();
        moveHash(a, len);
    }
}
 