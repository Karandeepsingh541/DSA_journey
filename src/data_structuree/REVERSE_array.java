package data_structuree;

import java.util.Arrays;

import static java.util.Collections.swap;

public class REVERSE_array {
    static void main() {
        int[] arr = {3, 6, 9, 8, 7, 6};
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for (int num : arr){
            System.out.print(num);
        }
    }
}
