package methods;

import java.util.Scanner;
public class ncr_function {
    public static int factooraL() {
        System.out.println("give n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("give r");
        Scanner mc = new Scanner(System.in);
        int r = mc.nextInt();
        int factorial_r = 1;
        int factorial_n = 1;
        int factorialn_r = 1;
        for (int i = 1; i <= n; i++) {
            factorial_n = factorial_n * i;
        }
        System.out.println("factorial of n is :" + factorial_n);
        for (int j = 1; j <= r; j++) {
            factorial_r *= j;
        }
        System.out.println("factorial of r is " + factorial_r);
        for (int k = 1; k <= (n - r); k++) {
            factorialn_r *=  k;
        }
        System.out.println("factorial of n-r is " + factorialn_r);
        double ncr = factorial_n / (factorial_r * (factorialn_r));
        System.out.println(ncr);
        return  0;
    }

        static void main() {
        System.out.println(factooraL());
    }
}
