package Leetcode150;

import java.util.Arrays;

public class RemoveDuplicates1 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 3, 4, 2, 2};
        int n = arr.length;

        // temporary array to store elements
        int[] temp = new int[n];
        int j = 0; // index for temp array

        System.out.println(Arrays.toString(arr));

        for(int i=0; i<n-1; i++) {
            if(arr[i] != arr[i+1]) {
                temp[j] = arr[i];
                j++;
            }
        }

        // adding the last element
        temp[j++] = arr[n-1];

        System.out.println(Arrays.toString(Arrays.copyOf(temp, j)));
    }
}
