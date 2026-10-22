package if_else;

import java.util.Scanner;

public class least_three {
    static void main() {
        System.out.println("enter no 1 ");
        System.out.println("enter no 2:");
        System.out.println("enter no 2 ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        if (y<x) {
            if (y < z) System.out.println("y is small");
            else System.out.println("z is small");
        }
        else if (x<y) {
            if (x<z) System.out.println("x is small");
            else System.out.println("z is small");
        }
        else System.out.println("all three same");
    }

}

