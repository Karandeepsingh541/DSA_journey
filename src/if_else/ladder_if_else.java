package if_else;

import java.util.Scanner;

public class ladder_if_else {
    static void main() {
        System.out.println("pgive a no ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        if(x%5==0 & x%3==0) System.out.println("divisible by 5 and 3 ");
        else if(x%3==0) System.out.println("divisible by 3");
        else if(x%5==0 ) System.out.println(" divisible by both 5 ");
        else System.out.println("neither");

    }
}
