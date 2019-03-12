package jianZhiOffer;

public class test1Temp {
    public static boolean Find(int target, int[][] array) {
        if (array == null | array.length == 0 | (array.length == 1 && array[0].length == 0))
            return false;
        //行数 a
        int a = array.length;
        //列数 b
        int b = array[0].length;
        int i = a - 1;
        int j = 0;
        while (i != -1 && j != b - 1) {
            if (array[i][j] == target) {
                return true;
            } else {
                if (target > array[i][j]) {
                    j++;
                } else {
                    i--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int array[][] = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        int array1[][] = {{1, 2, 8, 9}, {4, 7, 10, 13}};
        int array2[][] = new int[0][0];
        int array3[][] = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int target2 =1;
        int target = 7;
//        System.out.println(test1Temp.Find(target, array));
//        System.out.println(test1Temp.Find(target, array1));
//        System.out.println(test1Temp.Find(target, array2));
        System.out.println(test1Temp.Find(target2, array3));
    }
}
