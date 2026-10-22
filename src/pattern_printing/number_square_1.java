package pattern_printing;

import java.util.Scanner;

public class number_square_1 {
    static void main() {
        System.out.println("how many rows and colouwm ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1;j<=r;j++) {
                System.out.print((char)(num+64));
                num++;
            }
            System.out.println();
        }

    }
}