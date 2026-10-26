public class sum_1 {
    static void main() {
        System.out.println("sum_1");
        int[]arr = { 1,3 ,5,6,9};
        int n = arr.length;
        int carry ;
        for (int i = n-1 ; i >=0 ; i--) {
            if (arr[i]== 9){
                carry = 1;
                arr[i]=0;
                arr[n-i-1]=arr[n-i-1]+carry;
            } else if (arr[i]!= 9 ) {
                carry =0 ;
                arr[n-1]++;
            }


        }
        for (int sum :arr){
            System.out.print(sum + " ");
        }
    }
}
