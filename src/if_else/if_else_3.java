package if_else;

import java.util.Scanner;

public class if_else_3 {
    static void main() {
        //if cost price and selling price of an item is input through the keyboard , write a program to determine wether the seller has made profit or no profit or loss or no loss
        // also determine the loos or profit
        System.out.println("give buying price :");
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        System.out.println("give selling price :");
        double s = sc.nextDouble();
        if (s > b) {
            System.out.println("we made profit ");
            System.out.println("we made a profit of amount");
            System.out.println(s-b);
        }

        if (s<b) System.out.println("loss ");
        if(s == b) System.out.println("no loss no profit");
    }
}