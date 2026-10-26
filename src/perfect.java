public class perfect {
    static void main() {
        int [] arr = { 1,1,1,1};
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i]==arr[j]){
                    sum++;

                }
            }
        }
        System.out.println("there exist a total of "+ sum + "pairs ");
    }
}
