package loops;

import java.util.Scanner;

public class break_continue {
    // for ke andar if loop ko knhu  todna hai
    //  continue is used to skip iteration rarely used
    static void main() {
        // wap to print id a no is composote or not
        // 2 to n-1  tak koi factor mile n ka to n composite no
        System.out.println("give a no n");
        Scanner sc = new Scanner(System.in);
       boolean flag = true;
        int  n = sc.nextInt();
        for (int i =  2 ; i< n ; i++){
            if( n%i == 0 ) {
                flag = false;
                break;
            }
        }
        if (n==1) System.out.println("neither");
        else if(flag == false) System.out.println("comp");
        else System.out.println("p");

    }


}
