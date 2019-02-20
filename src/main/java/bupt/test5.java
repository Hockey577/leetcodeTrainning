package bupt;

import java.util.Scanner;

/**
 * 第一行：两个整数n（2<=n<=10）、k（1<=k<=5），两个数字之间用一个空格隔开，含义如上所示。
 * 接下来有n行，每行n个正整数，其中，第i行第j个整数表示矩阵中第i行第j列的矩阵元素Pij且（0<=Pij<=10）。另外，数据保证最后结果不会超过10^8。
 */
public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int data =0;
        int[][] a = new int[n][n];//保存初始值
        int[][] b = new int[n][n];//保存中间的结果
        int[][] c = new int[n][n];//保存最终结果
        //为矩阵赋值
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                b[i][j] = a[i][j];
                c[i][j] = a[i][j];
            }
        }

        //计算
        while (k>1) {
            for (int p = 0; p < n; p++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        data += b[p][j] * a[j][i];
                    }
                    c[p][i] = data;
                    data = 0;
                }
            }
            for (int i=0;i<n;i++){
                for (int j =0;j<n;j++){
                    b[i][j] = c[i][j];
                }
            }
            k--;
        }

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
