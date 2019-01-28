package leetcode.easy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 */
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0 || target < nums[0]) {
            return 0;
        } else if (target == nums[nums.length - 1]) {
            return nums.length - 1;
        } else if (target > nums[nums.length - 1]) {
            return nums.length;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                //如果前一个数字小于target，后一个数字大于target,记录该位置
                if (nums[i] < target && nums[i + 1] > target) {
                    return i + 1;
                } else if (nums[i] != target) {
                    continue;
                } else {
                    return i;
                }
            }
        }
        return -1;
    }
}

