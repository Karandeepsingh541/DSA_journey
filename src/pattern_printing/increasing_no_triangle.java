package pattern_printing;

import java.util.Scanner;

public class increasing_no_triangle {
    static void main() {
        System.out.println("give no of rows ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}