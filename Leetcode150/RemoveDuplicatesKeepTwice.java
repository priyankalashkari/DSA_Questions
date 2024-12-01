package Leetcode150;
import java.util.Arrays;

public class RemoveDuplicatesKeepTwice {
    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 1, 2, 2, 3, 4, 2, 4};
        int i=0;

        Arrays.sort(nums);
        for(int e : nums) {
            if(i < 2 || nums[i-2] != e) {
                nums[i] = e;
                i++;
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOf(nums, i)));
    }
}
