package loops;

import java.util.Scanner;

public class perfect_no {
    static void main() {
        System.out.println("tyope a no ;");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1 ; i < n ; i++){
            if(n%i == 0){
                System.out.println(i + "");
                sum =sum+i;
                }


            }

        if (sum==n) {
            System.out.println("perfect no");
            System.out.println(sum);
        }

        }

    }

