package pattern_printing;

import java.util.Scanner;

public class good_hw {
    static void main() {
        System.out.println("row");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1) {
                    System.out.print(j + (" "));
                }
                else System.out.print((char)(j+64 )+ (" "));
            }

            System.out.println();
        }

    }
}
