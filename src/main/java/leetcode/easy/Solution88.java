package leetcode.easy;

public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Sort.MergeSort(nums1);
    }
}
