package if_else;

import java.util.Scanner;

public class greatest_ohne_and {
    static void main() {
        System.out.println("enter no 1 ");
        System.out.println("enter no 2:");
        System.out.println("enter no 2 ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        if(x>y && x>z) {
            System.out.println("x is the bigger ");
        }
        else { // y ya z me si hoga ab to
            if (y > x && y > z) System.out.println(" y is biggest ");
            else System.out.println("z is biugger ");
        }
    }


    // all equal

}
