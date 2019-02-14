package schoolTest;

import java.util.ArrayList;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        //对a数组排序
        for (int m = 0; m < n; m++) {
            for (int j = 0; j < n; j++) {
                if (a[m] < a[j]) {
                    temp = a[m];
                    a[m] = a[j];
                    a[j] = temp;
                }
            }
        }
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(a[0]);
        for (int x = 1; x < a.length; x++) {
            if (a[x] != a[x - 1]) {
                b.add(a[x]);
            }
        }
        System.out.println(b.get(k-1));
    }
}
