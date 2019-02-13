package bupt;

import java.util.Scanner;

public class test1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd=0;
        int even=0;
        for(int i = 0; i < n; i++){
            if(sc.nextInt()%2 != 0){
                odd++;
            }else{
                even++;
            }
        }
        if(even > odd){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
