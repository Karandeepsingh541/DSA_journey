package loops;

import java.util.Scanner;

public class factorial {
    static void main() {
        System.out.println("give a no ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int factorial = 1;
        for (int n = 1; n <=x ;n++ ){
            factorial =factorial*n;
            System.out.println(factorial);
        }
    }
}
