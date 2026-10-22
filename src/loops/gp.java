package loops;

import java.util.Scanner;

public class gp {
    static void main() {
        System.out.println("till how many termsn");
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a =1 , r =2;
       for (int i =1 ; i<=n ; i++){
           System.out.println(a);
           a*=r;
       }



    }
}
