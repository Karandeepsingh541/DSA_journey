package data_structuree;

public class q1 {
    static void main() {
        int [] arr = {3,8,6,1,4};
        int sum=0;
        int n = arr.length;
        for (int i = 0; i< arr.length ; i++) {
            if (arr[i]%2==0){
                sum++;
                System.out.println("there exist a no and teh no is "+ arr[i] );
            }


        }
        System.out.println("total no of even no in arr are " +sum);
    }
}
