package leetcode.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int len = nums.length - 1;
        for (int i = 0; i < len; i++) {
            //如果当前数等于后一个数，那么从i之后的数全部往前移一位
            if (nums[i] == nums[i + 1]) {
                for (int j = i; j < len; j++) {
                    nums[j] = nums[j + 1];
                }
                len--;
                i--;
            } else {
                continue;
            }
        }
        return len + 1;
    }
}

