package jianZhiOffer;

import java.util.ArrayList;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class test9 {
    public static int JumpFloorII(int target) {
        if (target == 0) {
            return 0;
        } else if (target == 1) {
            return 1;
        } else if (target == 2) {
            return 2;
        }
        int f1 = 1;
        int f2 = 2;
        int res = 0;
        for (int i = 2; i < target; i++) {
            res = f1 + f2 + 1;
            f1 = res - 1;
            f2 = res;
        }
        return res;
    }
    public static void main(String[] args) {
        int target = 4;
        System.out.println(JumpFloorII(target));
    }
}
