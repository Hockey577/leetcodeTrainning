package byteDance;

/**
 * P为给定的二维平面整数点集。定义 P 中某点x，
 * 如果x满足 P 中任意点都不在 x 的右上方区域内（横纵坐标都大于x），
 * 则称其为“最大的”。求出所有“最大的”点的集合。（所有点的横坐标和纵坐标都不重复, 坐标轴范围在[0, 1e9) 内）
 * <p>
 * 如下图：实心点为满足条件的点的集合。请实现代码找到集合 P 中的所有 ”最大“ 点的集合并输出。
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 输入描述：
 * 第一行输入点集的个数 N， 接下来 N 行，每行两个数字代表点的 X 轴和 Y 轴。
 * 对于 50%的数据,  1 <= N <= 10000;
 * 对于 100%的数据, 1 <= N <= 500000;
 * <p>
 * 输出描述：
 * 输出“最大的” 点集合， 按照 X 轴从小到大的方式输出，每行两个数字分别代表点的 X 轴和 Y轴。
 */
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //把数都存起来
        int n = sc.nextInt();
        int[][] array = new int[n][2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
            map.put(array[i][0], array[i][1]);
        }
        //找数
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][0] < array[j][0] && array[i][1] < array[j][1]) {
                    map.remove(array[i][0]);
                }
                continue;
            }
        }
        //输出,按x轴从小大，所以先做一个排序
        int[][] a = new int[map.size()][2];
        Iterator<HashMap.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        int size = map.size();
        for (int i = 0; i < size; i++) {
            if (iterator.hasNext()) {
                HashMap.Entry<Integer, Integer> entry = iterator.next();
                a[i][0] = entry.getKey();
                a[i][1] = entry.getValue();
            }
        }
        int temp1, temp2;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (a[i][0] < a[j][0]) {
                    temp1 = a[i][0];
                    a[i][0] = a[j][0];
                    a[j][0] = temp1;
                    temp2 = a[i][1];
                    a[i][1] = a[j][1];
                    a[j][1] = temp2;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(a[i][0] + " " + a[i][1]);
        }
    }
}
