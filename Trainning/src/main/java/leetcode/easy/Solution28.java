package leetcode.easy;

public class Solution28 {
    /**
     * 算法思想：利用substring方法，可以取出haystack中长度为needle.length()的字符串与needle比较。
     * 如果存在，返回第一个出现needle的位置；如果不存在，返回-1
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        if (needle.equals("")) {
            return 0;
        } else {
            for (int i = 0; i < haystack.length() - len + 1; i++) {
                if (haystack.substring(i, i + len).equals(needle))
                    return i;
            }
        }
        return -1;
    }
}
