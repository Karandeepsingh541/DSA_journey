package data_structuree;

public class revrsesomearray_whileloop {
    static void main() {
        int [] arr = {1,4,5,89,87,65,45,6,7,8};
        int n = arr.length;
        int i = 2;
        int j = n-2-i;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int num : arr){
            System.out.print(num + " ");
        }

    }
}
