package pattern_printing;

import java.util.Scanner;

public class star_decreasin {
    static void main() {
        System.out.println("no of rows ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int num = 1;
        for (int i = 1 ; i <=r ; i++){
            for (int j = 1 ; j<= (r+1-i) ;j++){

                System.out.print((char)(64+ num) );
            }
            num++;
            System.out.println();
        }



    }
}
