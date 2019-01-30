package leetcode.easy;

public class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] c = new int[2];
        int b = nums.length;
        for (int i = 0; i < b; i++) {
            for (int j = i + 1; j < b; j++) {
                if (nums[i] + nums[j] == target) {
                    c[0] = i;
                    c[1] = j;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] c = Solution1.twoSum(nums, target);
        System.out.println(c[0] + "和" + c[1]);
    }
}
