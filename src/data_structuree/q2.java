package data_structuree;

import java.util.Scanner;

public class q2 {
    static void main() {
        int [ ] arr = { 4,9,2,9,7};
        int max = arr[0];
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("the max i s " +  max);

    }
}
