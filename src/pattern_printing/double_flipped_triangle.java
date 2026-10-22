package pattern_printing;

import java.util.Scanner;

public class double_flipped_triangle {
    static void main() {
        System.out.println("how many rows ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <=n; i++){
            for(int j = 1; j<=i;j++) {
                System.out.print("  ");
            }
            for(int j =1; j <=n+1-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
