package data_structuree;

import java.util.Arrays;
import java.util.Scanner;

public class min_array {
    static void main() {
        System.out.println("enter array lenth");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] karan = new int[n];
        int min = karan[0];
        for (int i = 0; i < n; i++) {
            karan[i] = sc.nextInt();
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            if (karan[i] < karan[0]) {
                min = karan[i];
            }

        }
        System.out.println(min);
    }
}
