package loops;

import java.util.Scanner;

public class ap_loop {
    static void main() {
        System.out.println(" give how many terms ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 2+(n-1)*3;

        for(int i = 2 ; i<= x ; i=i+3) {
            System.out.print(i +" ");

        }




    }

}
