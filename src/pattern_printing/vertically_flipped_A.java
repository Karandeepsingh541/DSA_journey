package pattern_printing;

import java.util.Scanner;

public class vertically_flipped_A {
    static void main() {
        System.out.println("how many rows or colouwm ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int num =1;
        for (int i = 1; i<=x ; i++){
            for(int j =1 ; j<=x-i;j++){
                System.out.print(" ");
            }
            for(int j =1 ; j<=i ;j++){
            System.out.print((char)(64+num)+" ");

            }
            num++;
            System.out.println();
        }
    }
}