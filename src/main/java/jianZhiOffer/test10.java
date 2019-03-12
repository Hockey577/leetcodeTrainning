package jianZhiOffer;

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * <p>
 * 解题方法：依旧是斐波那契数列 f(n) = f(n-1) + f(n-2)
 */
public class test10 {
    public int RectCover(int target) {
        int f1 = 1;
        int f2 = 2;
        int res = 0;
        if (target == f1 || target == f2 || target == res)
            return target;
        for (int i = 2; i < target; i++) {
            res = f1 + f2;
            f1 = f2;
            f2 = res;
        }
        return res;
    }
}
