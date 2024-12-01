package Leetcode150;

public class BuyandSell1 {
    public static void main(String[] args) {
        int nums[] = {7, 1, 5, 3, 6, 4};

        int buy = nums[0]; //minimum price
        int maxProfit = 0; //maximum profit

        for(int i=0; i<nums.length; i++) {
            int profit = nums[i] - buy;
            maxProfit = Math.max(maxProfit, profit);

            buy = Math.min(buy, nums[i]);
        }

        System.out.println(maxProfit);
    }
}
