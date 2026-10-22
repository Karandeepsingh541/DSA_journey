package pattern_printing;

import java.util.Scanner;

public class pyramid {
static void main() {



    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    for (int i =1 ; i <= x ;i++ ){
        for (int j =1; j <=x-i ;j++ ){
            System.out.print(" ");
        }
        for (int j =1;j<=i;j++ ){
            System.out.print( (char)(j+64));
        }
        System.out.println();
    }

}
}
