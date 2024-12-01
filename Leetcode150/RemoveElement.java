package Leetcode150;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int index = 0; // Pointer for the position to store valid elements

        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val, keep it
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Return the count of elements not equal to val
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3}; // Input array
        int val = 3;              // Element to be removed

        // Call the removeElement function
        int newLength = removeElement(nums, val);

        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
