package data_structuree;

public class missing_arrya {
    static void main() {
        System.out.println("hello");
        int[] arr = {1, 2, 3, 5, 6, 8};

        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            if (arr[i + 1] - arr[i] == 2) {
                System.out.println("the missing no is ");
                int temp = arr[i] + 1;
                System.out.println(temp);
            }

        }
    }
}
