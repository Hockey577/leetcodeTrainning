package leetcode.easy;

public class Solution67 {
    public String addBinary(String a, String b) {
        String reverseA = new StringBuffer(a).reverse().toString();
        String reverseB = new StringBuffer(b).reverse().toString();
        StringBuffer ans = new StringBuffer();
        int lenA = a.length();
        int lenB = b.length();
        int carry = 0;
        for (int i = 0; i < (lenA < lenB ? lenB : lenA); i++) {
            int t = carry;
            if (carry > 0)
                carry = 0;
            if (i < lenA)
                t += Integer.parseInt(reverseA.charAt(i) + "");
            if (i < lenB)
                t += Integer.parseInt(reverseB.charAt(i) + "");
            if (t > 1) {
                t -= 2;
                carry = 1;
            }
            ans.append(t + "");
        }
        if (carry > 0)
            ans.append("1");
        return ans.reverse().toString();
    }
}

