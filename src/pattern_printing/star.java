package pattern_printing;

import java.util.Scanner;

public class star {
    static void main() {
         // we will be given with variable roes and coloums from user //
        System.out.println("enter no of rows ");
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
        System.out.println("enter no of colouwm");
    Scanner mc = new Scanner(System.in);
    int c = mc.nextInt();
    for (int i =1 ; i<=row; i++) {
        for (int j = 1; j <= c; j++) {
            System.out.print(" * ");
        }
        System.out.println();
    }

    }


}
