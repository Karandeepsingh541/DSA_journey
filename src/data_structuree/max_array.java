package data_structuree;

import java.util.Scanner;

public class max_array {
    static void main() {
        System.out.println("enter lenth ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] karan = new int[n];

        System.out.println("give elements");
        for (int i = 0 ; i < n ; i++ ){
            karan[i] = sc.nextInt();

        }
        int  max = karan[0];
        for (int i =0 ; i <n  ;i ++ ){
            if(karan[i ]> max){
                max= karan[i];
            }

        }
        System.out.println(" min is " + max);

    }
}
