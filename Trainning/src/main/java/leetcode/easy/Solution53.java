package leetcode.easy;

public class Solution53 {
    public static int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum;
        sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            result = Math.max(result, sum);
        }
        return result;
    }
}
