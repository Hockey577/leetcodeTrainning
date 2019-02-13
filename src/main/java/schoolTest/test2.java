package schoolTest;

import java.util.Scanner;

public class test2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //输入行数
        int n = sc.nextInt();
        //创建字符串数组
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next().toString();
            if (s[i].length() > 100) {
                return;
            }
            //判断该行密码是否合法
            if (checkPsd(s[i]) == false) {
                System.out.println("NO ");
            } else {
                System.out.print("YES ");
            }
        }
        System.out.print(" ");
    }

    private static boolean checkPsd(String s) {
        int[] cnt = new int[3];
        //4、密码长度至少为8
        if (s.length() < 8)
            return false;
        //2、不能以数字开头
        if (s.charAt(0) <= '9' && s.charAt(0) >= '0')
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                cnt[0] = 1;
            } else if (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') {
                cnt[1] = 1;
            } else if (s.charAt(i) <= 'z' && s.charAt(i) >= 'a') {
                cnt[2] = 1;
            } else {
                return false;
            }
        }
        if (cnt[0] + cnt[1] + cnt[2] >= 2) {
            return true;
        }
        return true;
    }
}
