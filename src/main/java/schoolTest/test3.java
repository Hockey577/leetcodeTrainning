package schoolTest;

import java.util.ArrayList;
import java.util.Scanner;

public class test3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int s = 0;
//        int[] a = new int[n];
//        ArrayList<Integer> aTemp = new ArrayList<Integer>();
//        int[] b = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//            aTemp.add(a[i]);
//        }
//        //给结点排序 归并排序
//        mergeSort(aTemp, 0, a.length - 1);
//
//        for (int q = 0; q < aTemp.size(); q++) {
//            a[q] = aTemp.get(q);
//        }
//        b[0] = n - 1;
//        b[1] = n - 1;
//        aTemp.remove(0);
//        aTemp.remove(1);
//        aTemp.add(a[0] + a[1]);
//        mergeSort(aTemp, 0, aTemp.size() - 1);
////        for (int i = 2; i < n; i++) {
////            b[i] = n - i;
////        }
//        for (int i = 0; i < n; i++) {
//            s += a[i] * b[i];
//        }
//        System.out.println(s);
//    }
//
//    public static void mergeSort(ArrayList<Integer> a, int low, int high) {
//        int mid = (low + high) / 2;
//        if (low < high) {
//            //左边
//            mergeSort(a, low, mid);
//            //右边
//            mergeSort(a, mid + 1, high);
//            //合并
//            merge(a, low, mid, high);
//        }
//    }
//
//    public static void merge(ArrayList a, int low, int mid, int high) {
//        //思路：先用小数组存下当前排序结果，再赋值到a
//        int[] temp = new int[high - low + 1];
//        int k = 0;
//        //左指针
//        int i = low;
//        //右指针
//        int j = mid + 1;
//        //初步排序，将小数先放好
//        while (i <= mid && j <= high) {
//            if (a.get(i) < a.get()) {
//                temp[k++] = a[i++];
//            } else {
//                temp[k++] = a[j++];
//            }
//        }
//
//        //初步排序后，如果前半边还有数，则继续放置于temp中
//        while (i <= mid) {
//            temp[k++] = a[i++];
//        }
//        while (j <= high) {
//            temp[k++] = a[j++];
//        }
//        //排完后，赋值回a
//        for (int m = 0; m < temp.length; m++) {
//            a[low + m] = temp[m];
//        }
//    }
}
