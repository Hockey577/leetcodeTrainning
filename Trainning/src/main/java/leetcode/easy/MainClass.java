package leetcode.easy;
import leetcode.easy.ListNode;
import leetcode.easy.Solution83;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketOptions;

import static jdk.nashorn.internal.objects.Global.print;

public class MainClass {
    //排序测试
    public static void main(String[] args) {
        int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
        Sort.bubbleSort(data);
        System.out.println("排序后的数组：");
        print(data);
    }

    public static void print(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }


}