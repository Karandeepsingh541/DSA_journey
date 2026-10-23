package data_structuree;

public class reverseonlysumno {
    static void main() {
        int [] arr  = { 1,4, 5, 89, 87, 65, 45, 6, 7, 8};
        int n = arr.length;
        for (int i = 2 ; i <n/2; i++){
            int temp =arr[i];
            arr[i]=arr[n-2-i];
            arr[n-2-i]=temp;
         }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

}
