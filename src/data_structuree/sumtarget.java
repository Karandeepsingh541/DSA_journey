package data_structuree;

public class sumtarget {
    static void main() {
        int [] x = { 1,5,8,-3,1};
        int target = 2 ;
        int found = -1;
        int found_2 = -2;
        for(int i = 0 ; i < x.length;i++){
            for (int j =1+i; j <x.length;j++){
                if(x[i]+x[j]==target){
                    found=i;
                    found_2=j;
                }


            }

        }
        if(found!=-1 && found_2!=-2) System.out.println("we have two numbers whose sum is 2 and tehy are " + found + "and "+ found_2);
        else System.out.println(" f off");
    }
}
