package leetcode.easy;

/**
 * 十种常见排序算法默写 第一次
 */
public class Sort {
    /**
     * 冒泡排序
     * 里层循环是单次最大的数放最后
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        int temp;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void mergeSort(int[] arr){

    }


}
