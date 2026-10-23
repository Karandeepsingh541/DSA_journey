package data_structuree;

import java.util.Scanner;

public class q3 {
    static void main() {
        int [] arr = { 2,5,2,8,5,2};
        int n = arr.length;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i <n ; i++) {
        if (arr[i]==x){
            sum++;
        }

        }
        System.out.println("the no " + x+ " appeared" + sum+"times");
    }
}
