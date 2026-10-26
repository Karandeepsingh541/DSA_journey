package data_structuree;

public class candy_question {
    static void main() {
        int [] candies = {2,3,5,1,3};
        int n = candies.length;
        int sum = 0 ;
        boolean flag = false ;
        int extra_candy = 3;
        int max = candies[2];
        for (int i = 0; i < n; i++) {
            if (candies[i]+3>=max){
                flag = false;
                sum = extra_candy + candies[i];
                System.out.println("the child on index "+ i +"have the largest no of candies " + sum );
            }
        }
    for (int num:candies){
        System.out.print(num);

    }
    }
}
