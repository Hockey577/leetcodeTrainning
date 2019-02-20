package schoolTest;

import java.util.Scanner;

/**
 * 存在n+1个房间，每个房间依次为房间1 2 3...i，每个房间都存在一个传送门，i房间的传送门可以把人传送到房间pi(1<=pi<=i),
 * 现在路人甲从房间1开始出发(当前房间1即第一次访问)，每次移动他有两种移动策略：
 A. 如果访问过当前房间 i 偶数次，那么下一次移动到房间i+1；
 B. 如果访问过当前房间 i 奇数次，那么移动到房间pi；
 现在路人甲想知道移动到房间n+1一共需要多少次移动；

 输入描述：第一行包括一个数字n(30%数据1<=n<=100，100%数据 1<=n<=1000)，
 表示房间的数量，接下来一行存在n个数字 pi(1<=pi<=i), pi表示从房间i可以传送到房间pi。

 输出描述：输出一行数字，表示最终移动的次数，最终结果需要对1000000007 (10e9 + 7) 取模。

 例子：输入 2
            1 2
       输出 4
 */
public class letter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int i = 0;i<n;i++){

        }
    }
}
