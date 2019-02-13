package bupt;

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> res = new ArrayList<Integer>();
        while (n > 1) {
            if (n % 2 == 0) {
                res.add(0);
            } else {
                res.add(1);
            }
            n = n / 2;
        }
        if (n == 1)
            System.out.print(1);
        for (int i = res.size() - 1; i >= 0; i--) {
            System.out.print(res.get(i));
        }
    }


}
