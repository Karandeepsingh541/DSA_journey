package data_structuree;

import javax.print.DocFlavor;
import java.util.Arrays;

public class shallowdeepcopy {
    static void main() {
        System.out.println("enter an array ");
        int[] roll = {1, 2, 3, 4};
        int[] b = roll; // no copy
        b[0] = 100;
        for (int i = 0; i < 4; i++) {
            System.out.print(b[i] + " ");


        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.print(roll[i] + " ");


        }
        System.out.println();
        String []name = { "mahi" , "ayush" , "nivi" , "shivi" };
        String[]naame = name.clone();
        naame[0] = "nidhi";
        for (int i = 0 ; i <4 ; i++){
            System.out.print(naame[i] + " ");
        }
        System.out.println();
        for (int i = 0 ; i <4 ; i++){
            System.out.print(name[i] + " ");
        }
        System.out.println();
        int [][] m = { {1,2,3},{4,5,6}};
        int [][ ] s = m.clone();
        s[1][1] =100;
        s[0] = new int [] {5,5};
        for (int i = 0 ; i <2 ; i++){
            System.out.print(Arrays.toString(m[i]));
        }
        System.out.println();
        for (int i = 0 ; i <2 ; i++){

            System.out.print(Arrays.toString(s[i] )+ " ");
        }



    }
}