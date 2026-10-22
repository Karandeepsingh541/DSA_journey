package basics;

import java.util.Scanner;

public class if_else_1 {
    static void main() {
        // agar magar wali baten
        // take positive integer input and tell if it is odd or even
        Scanner no = new Scanner(System.in);
        System.out.println("enter a no ");
        double x = no.nextDouble();
        if (x % 2 == 0) {
            System.out.println("even no ");
        }
        else
        System.out.println("odd");
    }



}



