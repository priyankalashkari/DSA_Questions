package PracticeQuestions1;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] arr) {
        int result[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=arr.length-1; i>=0; i--) {
            while(!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? 0 : stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 6, 7, 11};
        System.out.println(Arrays.toString(nextGreaterElement(arr)));
    }
}
