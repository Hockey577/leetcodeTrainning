package jianZhiOffer;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * <p>
 * 解法：可以利用找规律，因为这两种跳法，所以f(n) = f(n-1) + f(n-2)
 */
public class test8 {
    public static int JumpFloor(int target) {
        int res = 0;
        if (target == 0) {
            return 0;
        } else if (target == 1) {
            return 1;
        } else if (target == 2) {
            return 2;
        } else {
            int f1 = 1;
            int f2 = 2;
            for (int i = 2; i < target; i++) {
                res = f1 + f2;
                f1 = f2;
                f2 = res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int target = 3;
        System.out.println(JumpFloor(target));
    }
}
