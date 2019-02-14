package schoolTest;

import java.util.Scanner;

public class test1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next().toString();
        int[] cnt = new int[10];
        if (input.length() < 1 || input.length() > 1000) {
            return;
        }
        //记录字符串每个字符出现的次数
        for (int i = 0; i < input.length(); i++) {
            cnt[input.charAt(i) - '0']++;
        }
        int min = 0;
        for (int i = 0; i < 10; i++) {
            if (cnt[i] < cnt[min] || (min == 0 && cnt[i] <= cnt[min])) {
                min = i;
            }
        }
        //如果最小值是0
        if (min == 0) {
            System.out.print(1);
            if (cnt[1] > 0) {
                for (int i = 0; i < cnt[0] + 1; i++) {
                    System.out.print(0);
                }
            }
        } else {
            for (int i = 0; i < cnt[min] + 1; i++)
                System.out.print(min);
        }
    }


}
