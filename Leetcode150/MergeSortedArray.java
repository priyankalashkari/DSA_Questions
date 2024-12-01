package Leetcode150;

import java.util.Arrays;

public class MergeSortedArray {
    public static void mergeSortedArray(int[] nums1, int[] nums2, int m, int n) {
        // we start from the last index
        int p1 = m-1;
        int p2 = n-1;
        int p = m+n-1;

        while(p1>=0 && p2>=0) {
            if(nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        while(p2>=0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 6};
        int m=3, n=3;
        mergeSortedArray(nums1, nums2, m, n);

        System.out.println("Merged: " + Arrays.toString(nums1));

        //        -> without using Arrays.toString method
        //        for(int nums : nums1) {
        //            System.out.println(nums + " ");
        //        }
    }
}
