package PracticeQuestions1;

import com.sun.security.jgss.GSSUtil;

public class recursionBasic {
    static int recurSum(int n) {
        if(n<=1) {
            return n;
        }
        return n + recurSum(n-1);
    }

    static int power(int n, int p) {
        if(p==0) {
            return 1;
        }
        return n * power(n, p-1);
    }

    static boolean isSorted(int arr[], int startIndex, int size) {
        if(size==0 || size==1) {
            return true;
        }
        if(arr[startIndex] > arr[startIndex + 1]) {
            return false;
        }
        else {
            return isSorted(arr, startIndex+1, size-1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 6, 9, 10, 11};
        int size = arr.length;
        System.out.println(recurSum(6));
        System.out.println(power(2, 4));
        boolean ans = isSorted(arr, 0, size);
        if(ans) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
