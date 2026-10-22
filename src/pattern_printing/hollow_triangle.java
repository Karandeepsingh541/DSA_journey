package pattern_printing;

import java.util.Scanner;

public class hollow_triangle {
    static void main() {
        System.out.println("no of rows ");
        System.out.println("no of colouwm");
        Scanner sc = new Scanner(System.in);
        Scanner mc = new Scanner(System.in);
        int r = mc.nextInt();
        int c = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if ( j ==3 || i ==3) {
                    System.out.print("*");

                }else System.out.print(" ");

            }
            System.out.println();
        }

    }
}