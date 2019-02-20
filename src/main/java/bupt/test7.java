package bupt;

import java.util.Scanner;

public class test7 {
    /**
     * 牌只有1到9，手里拿着已经排好序的牌a，对方出牌b，用程序判断手中牌是否能够压过对方出牌。
     * 规则：出牌牌型有5种
     * [1]一张 如4 则5...9可压过
     * [2]两张 如44 则55，66，77，...，99可压过
     * [3]三张 如444 规则如[2]
     * [4]四张 如4444 规则如[2]
     * [5]五张 牌型只有12345 23456 34567 45678 56789五个，后面的比前面的均大。
     *
     * 输入：12233445566677
             33
     输出：YES
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String[] temp;

    }

}
