package data_structuree;

public class rotate_Array {
    static void main() {
        int [] arr =  { 1 , 2 ,3 ,4,5,};
        int n = arr.length;
        int d = 1;
        int i = d-1;
        int j = n-d-1;
        while(i<=d){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
            i++;
            j++;

        }
     for (int num: arr){
     System.out.println(num);
 }
    }
}
