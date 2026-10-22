package data_structuree;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class sortingarrays {
    static Scanner sc = new Scanner(System.in);

    static void takeInput(int[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
    }

    static void print(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }


    static void main() {
        System.out.println("enter array lenth");

        int n = sc.nextInt();
        int[] arr = new int[n];
        takeInput(arr);
        print(arr);
        System.out.println();
        for (int i = 0 ; i < arr.length;i++){
            if (arr[i]%2==0){
                arr[i] = arr[i]+10;
                }
            else   {
                arr[i] = arr[i]*2;

            }
            System.out.println();


        }
        print(arr);
        }


 }
