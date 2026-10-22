package data_structuree;

import java.util.Scanner;

public class findingtarget {
    static void main() {
        int[] x = { 1,2 ,3 ,78,96,78,3,99};
        System.out.println("give a no ");
        int found = -1 ;
        Scanner sc = new Scanner(System.in);
        int target= sc.nextInt();
        for (int i = 0 ; i<x.length;i++){
            if (target==x[i]){
                found =i;
                System.out.println("there exist a no om index "+ i);

            }


        }
         if (found==-1) System.out.println("nothing");



    }
}
