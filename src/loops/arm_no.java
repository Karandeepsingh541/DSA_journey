package loops;

import java.util.Scanner;

public class arm_no {
    static void main() {
        System.out.println("enter no");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int n = sc.nextInt();
        for ( ;n!=0;){
            n=n/10;
            count++;



        }
        System.out.println(count);

        }





    }

