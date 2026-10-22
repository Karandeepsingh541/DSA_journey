package if_else;

import java.util.Scanner;

public class if_else_5 {
    static void main() {
        System.out.println("type your x cordinate");
        System.out.println("type y cordinate");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x== 0 & y == 0) System.out.println("origin");
        else if (x == 0) System.out.println("lies on y axis ");
        else if (y==0) System.out.println(" lies on x axis");

        else if(x>0 & y >0) System.out.println("1 st quad ");
        else if(x<0 & y>0) System.out.println("2nd quad ");
        else if(x<0 & y<0) System.out.println("3rd quad ");


       else System.out.println("4th quad");



    }





}
