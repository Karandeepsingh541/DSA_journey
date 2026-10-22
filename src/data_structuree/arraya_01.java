package data_structuree;

import java.util.Scanner;

public class arraya_01 {
    static void main() {
        System.out.print(" how many numbers  ");
        Scanner sc = new Scanner(System.in);
        int sum = 0 ;

        int n = sc.nextInt();
        int[] karan = new int[n];
        System.out.println("give numbers ");
        for (int i = 0; i < n; i++) {
            karan[i] = sc.nextInt();
        }
         for (int i = 0 ;i <n;i++ ){
             System.out.println();
             sum = sum+karan[i];

         }
        System.out.print(sum);
    }
}
