package PracticeQuestions1;

import java.util.*;

public class Array_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // segment
        int x = sc.nextInt();
        // size of length
        int n = sc.nextInt();

        //space
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // [2, 3, 4, 5, 1] o/p = 5
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<=(n-x); i++) {
            min = Integer.MAX_VALUE;
            for(int j=0; j<(i+x); j++) {
                min = Math.min(min, arr[j]);
            }
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
    }
}
