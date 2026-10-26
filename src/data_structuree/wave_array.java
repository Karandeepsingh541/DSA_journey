package data_structuree;

public class wave_array {
    static void main() {
        System.out.println("hello");
        int [] arr = {2,4,7,8,9,10};
        int n = arr.length;
        for (int i = 0; i < n; i=i+2) {
            for (int j = 1+i; j < n ; j++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
                break;

            }

        }
    for (int num : arr) {
        System.out.print(num + " ");
    }
    }
}
