package methods;

import java.util.Scanner;

public class max_4no {
    static void main() {
        System.out.println("entrer no01 ");
        System.out.println("enter no 2 ");
        System.out.println(" enter no 3 ");
        System.out.println(" enter no 4 ");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        Scanner bc = new Scanner(System.in);
        int b = bc.nextInt();
        Scanner ac = new Scanner(System.in);
        int c = ac.nextInt();
        Scanner mc = new Scanner(System.in);
        int d = mc.nextInt();
        int m = Math.max(Math.max(a,b),Math.max(c,d));
        System.out.println(m);



    }
}
