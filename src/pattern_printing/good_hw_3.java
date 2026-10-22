package pattern_printing;

import java.util.Scanner;

public class good_hw_3 {
    static void main() {
        System.out.println("give no of rows ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1 ; i <=x ; i++){
            for (int j = 1; j <=i ; j++){
                if ((i+j)%2==0){
                    System.out.print("1");
                }
                else System.out.print("0");
            }
            System.out.println();
        }
    }
}
