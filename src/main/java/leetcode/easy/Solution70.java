package leetcode.easy;

/**
 * 斐波那契数列 f(n) = f(n-1) + f(n-2)
 * 直接递归会有大量重复，比如f(n) = f(n-1) + f(n-2);f(n-1) = f(n-2)+f(n-3);
 * 所以可以设置一个数组保存每个数字的方法数。
 */
public class Solution70 {
    public int climbStairs(int n) {
        int[] nums = new int[n + 1];
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        nums[1] = 1;
        nums[2] = 2;
        nums[n] = climb(nums, n);
        return nums[n];
    }

    private int climb(int[] nums, int n) {
        int x = n - 1;
        int y = n - 2;
        if (x > 2 && nums[x] == 0) {
            nums[x] = climb(nums, x);
        }
        if (y > 2 && nums[y] == 0) {
            nums[y] = climb(nums, y);
        }
        nums[n] = nums[x] + nums[y];
        return nums[n];
    }
}
