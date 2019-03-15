package byteDance;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 给定一个数组序列, 需要求选出一个区间, 使得该区间是所有区间中经过如下计算的值最大的一个：
 * 区间中的最小数 * 区间所有数的和,最后程序输出经过计算后的最大值即可，不需要输出具体的区间。
 * 如给定序列  [6 2 1]则根据上述公式, 可得到所有可以选定各个区间的计算值:
 * <p>
 * [6] = 6 * 6 = 36;
 * [2] = 2 * 2 = 4;
 * [1] = 1 * 1 = 1;
 * [6,2] = 2 * 8 = 16;
 * [2,1] = 1 * 3 = 3;
 * [6, 2, 1] = 1 * 9 = 9;
 * <p>
 * 从上述计算可见选定区间 [6] ，计算值为 36， 则程序输出为 36。
 * 区间内的所有数字都在[0, 100]的范围内;
 */
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        //a数组保存输入的数，res保存结果
        int[] a = new int[n];
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        //计算,从区间只有一个值开始
        for (int k = 1; k <= n; k++) {
            for (int i = 0; i < n - k + 1; i++) {
                int min = a[i];
                for (int j = 0; j < k; j++) {
                    //拿到子区间的最小值
                    if (min > a[i + j])
                        min = a[i + j];
                    s += a[i + j];
                }
                res.add(min * s);
                s = 0;
            }
        }
        //对结果排序，只要最大值就行
        int max = res.get(0);
        for (int i = 1; i < res.size(); i++) {
            if (max < res.get(i)) {
                max = res.get(i);
            }
        }
        System.out.println(max);
    }
}
