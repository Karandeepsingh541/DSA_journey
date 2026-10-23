package data_structuree;
import java.util.Arrays;
public class secondlarget_in_array {
    static void main() {
        int [] x = {4,10,10,6,3,8};
        int max = Integer.MIN_VALUE;
        int smax =Integer.MIN_VALUE;
        for(int i = 0 ; i < x.length; i++){
            if(x[i]>max){
                smax=max;
                max=x[i];


            }
            else if (x[i]>smax && max!=x[i]) {
                smax=x[i];

            }


        }
        System.out.println(smax);
        System.out.println(max);
    }
}
