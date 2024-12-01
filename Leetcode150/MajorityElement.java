package Leetcode150;

public class MajorityElement {
    public static void main(String[] args) {

        int nums[] = {2, 3, 2, 3, 3};
        int candidate = nums[0];
        int count = 0;

        for (int num: nums) {
            if(count == 0) {
                candidate = num;
            }
            if(num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        System.out.println(candidate);
    }
}
