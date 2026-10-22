package if_else;

import java.util.Scanner;

public class if_else_1 {
    static void main() {
        // take integer input and print absolute cvalue of that integer
        System.out.println("give a no :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x<0){
            System.out.println("absolute value is :");
            System.out.println(-x);


        }
        else
            System.out.println(x);
    }
}
