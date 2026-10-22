package loops;

import java.util.Scanner;

public class decreasing_loop {
    static void main() {
        // print no from n to 1
        System.out.println("give a no n ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = x  ; i >=1 ; i--){
            System.out.println(i);
        }

    }
}
