package leetcode.easy;

/**
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 * <p>
 * 算法思想：对第n个数字报数，需要直到第n-1个数字是什么，这样就形成了递归。
 */
public class Solution38 {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        //递归调用，然后对字符串处理
        String str = countAndSay(n - 1) + "*";//为了str末尾的标记，方便循环读数
        char[] c = str.toCharArray();
        int count = 1;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == c[i + 1]) {
                count++;//计数增加
            } else {
                //s.append(s);
                s.append("" + count + c[i]);//上面的*标记这里方便统一处理
                count = 1;//初始化
            }
        }
        return s.toString();
    }
}
