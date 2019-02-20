package bupt;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        int[][] res = new int[5][5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                res[i][j] = sc.nextInt();
            }
        }
        int a, b, c, d;
        /**
         * 前两个代表操作类型，后两个数x y代表需操作数据为以x y为左上角的那几个数据。
         * 1 2 表示：90度，顺时针，翻转4个数  1 3 表示：90度，顺时针，翻转9个数
         * 2 2 表示：90度，逆时针，翻转4个数  2 3 表示：90度，逆时针，翻转9个数
         */
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt() - 1;
        d = sc.nextInt() - 1;
        if (a == 1 && b == 2) {
            //顺时针翻转4个数
            int[][] res_1 = new int[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    res_1[i][j] = res[c + i][d + j];
                }
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    res[c + i][d + j] = res_1[1-j][i];
                }
            }
        }
        if (a == 1 && b == 3) {
            int[][] res_1 = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    res_1[i][j] = res[c + i][d + j];
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    res[c + i][d + j] = res_1[2-j][i];
                }
            }
        }
        if (a == 2 && b == 2) {
            int[][] res_1 = new int[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    res_1[i][j] = res[c + i][d + j];
                }
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    res[c + i][d + j] = res_1[j][1 - i];
                }
            }
        }
        if (a == 2 && b == 3) {
            int[][] res_1 = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    res_1[i][j] = res[c + i][d + j];
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    res[c + i][d + j] = res_1[j][2 - i];
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
