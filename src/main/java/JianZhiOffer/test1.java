package JianZhiOffer;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class test1 {
    public static boolean Find(int target, int[][] array) {
        if (array==null| array.length == 0 | (array.length==1 && array[0].length==0))
            return false;
        //行数 a
        int a = array.length;
        //列数 b
        int b = array[0].length;
        //如果目标数字比最小的数还要小或者比最大的数还要大
        if (target < array[0][0] | target > array[a - 1][b - 1])
            return false;
        //比较对角线
        for (int i = 0; i < a; i++) {
            if (target == array[i][i])
                return true;
            if (i != a - 1) {
                if (target > array[i][i] && target < array[i + 1][i + 1]) {
                    for (int m = 0; m < (a - 1); m++) {
                        for (int n = 0; n < (i + 1); n++) {
                            if (array[m][n] == target)
                                return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int array[][] = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        int array1[][] = {{1, 2, 8, 9}, {4, 7, 10, 13}};
        int array2[][] = new int[0][0];
        int target = 7;
        System.out.println(test1.Find(target, array));
        System.out.println(test1.Find(target, array1));
        System.out.println(test1.Find(target, array2));
    }
}