package data_structuree;

public class q4 {
    static void main() {
        int [] arr = {3, 3, 100, 9, -1, -1};
        int target = 10;
        boolean flag = false;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1+i; j <n ; j++) {
                if(arr[i]+arr[j]==target) {
                    flag = true;
                    System.out.println("the given pairs are "+ "{ " + arr[i] +","+ arr[j] +"}");
                }
            }


        }
        if (flag==false){
            System.out.println("there exist nothing ");

        }
    }
}
