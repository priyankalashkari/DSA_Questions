package PracticeQuestions1;

import java.util.*;

public class TrapeziumPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt(); // height of trapezium
        int totalRows = 2 * N - 1; // Total number of rows in the pattern

        for (int i = 1; i<=totalRows; i++) {
            if (i == 1 || i == totalRows) {
                System.out.println(" * * - * * ");
            } else if (i == 2 || i == (totalRows - 1)) {
                System.out.println(" * - - - *");
            } else if(i==3){
                System.out.println(" - - - - -");
            }
        }
    }
}