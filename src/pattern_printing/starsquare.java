package pattern_printing;

import java.util.Scanner;

public class starsquare {
    static void main(String[] args) {
        System.out.println("square printing ");
       Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rpwa and coloum");
        int r = sc.nextInt();
       // System.out.println("enter char value ");
       // Scanner mc = new Scanner(System.in);
     //   int value = mc.nextInt();
      //  char asciiChar = (char) value;
      //  for (int i = 1; i <= r; i++) {
        //    System.out.print(i);
            //System.out.print(" ");
          //  System.out.print(i+1)


        int num = 1;

        for (int row = 0; row < 3; row++) { // 3 rows total
            for (int col = 0; col < 4; col++) { // 4 numbers per row
                System.out.print(num + "\t");
                num++; // Increment to the next number
            }
            System.out.println(); // New line after finishing a row
        }

        System.out.println(num);
    }
}