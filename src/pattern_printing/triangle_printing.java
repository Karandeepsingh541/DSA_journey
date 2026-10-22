package pattern_printing;

import java.util.Scanner;

public class triangle_printing {
    static void main() {
        System.out.println("how many r or c");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 1 ; i <= r ; i++){
            for (int j = 1 ; j<=i ;j++){
                System.out.print((char)(i+64) );

            }
            System.out.println();
        }





    }
}
