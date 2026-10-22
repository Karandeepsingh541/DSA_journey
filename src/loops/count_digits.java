package loops;

import java.util.Scanner;

public class count_digits {
    static void main() {
        System.out.println("give an iinoout no ");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        for(int n = 0; n!=0 ;n++){

            n=n/10;
            count++;
            System.out.println(count);

        }

    }
}
