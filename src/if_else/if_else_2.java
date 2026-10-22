package if_else;

import java.util.Scanner;

public class if_else_2 {
    static void main() {
        // take a real no input and check if it is integer or not
        System.out.println("enter a no :");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = (int) x;
        if (x - n != 0) {
            System.out.println("not integer ");
        }
        else ;
        System.out.println("integer");


    }

}