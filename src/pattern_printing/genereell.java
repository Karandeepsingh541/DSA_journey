package pattern_printing;

import java.util.Scanner;

public class genereell {
    static void main() {
        System.out.println("no of #");
        //Scanner sc = new Scanner(System.in);
        //int x = sc.nextInt();
        System.out.println("no of star ");
        Scanner mc = new Scanner(System.in);
        int n = mc.nextInt();
        for (int i = 0 ; i <=n;i++) {
            for (int j = 0; j <= n+1-i; j++) {
                System.out.print("#");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
