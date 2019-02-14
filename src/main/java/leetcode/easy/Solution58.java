package leetcode.easy;

public class Solution58 {
    public int lengthOfLastWord(String s) {
        if (!s.contains(" ")) {
            return s.length();
        }
        int count = 0;
        int j = 0;
        if (s.charAt(s.length() - 1) == ' ') {
            for (int i = s.length() - 1; i > -1; i--) {
                if (s.charAt(i) == ' ') {
                    j++;
                } else {
                    break;
                }
            }
        }
        for (int i = s.length() - 1 - j; i > -1; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else
                return count;
        }
        return count;
    }
}
