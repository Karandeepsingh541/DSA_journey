package data_structuree;

public class sumtarget {
    static void main() {
        int [] x = { 1,5,8,-3,1};
        int target = 2 ;
        int found = -1;
        //int found_2 = -2;
        int m=-1;
        for(int i = 0 ; i < x.length;i++){
            for (int j =i+1; j <x.length;j++){
                if(x[i]+x[j]==target){
                    found=i;
                    //found_2=j;
                    m = j;
                    System.out.println("there are two numbers whose sum is 2 and they are on index " + found + "and " + m );
                    System.out.println("those two no are "+ x[found] +"and " + x[m]);

                }


            }
        }

    }
}
