package if_else;

import java.util.Scanner;

public class if_else_4 {
    static void main() {
        System.out.println("give breath ");
        System.out.println("give lenth");
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double area = l*b;
        double perimeter = 2*(l+b);
        if (area > perimeter ) System.out.println(" area more ");
        else System.out.println("more perimeter");





    }


}

