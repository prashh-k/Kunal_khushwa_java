package Assignments.Lec_5_Searching;


///Incomplete

public class _69_sqrt {
    public static void main(String[] args) {
        int num = 100;

        System.out.println(sqrt(num));

    }
    public static int sqrt(int num){
        int start =0;
        int end = num /2;

//        if(num <= 1 && num >= 3){
//            return 1;
//        }
//        if(num == 4){
//            return 2;
//        }


        while(start<end){
            int mid = start + (end - start)/2;
            if(mid * mid < num){
                start = mid;
            }else if(mid * mid > num){
                end = mid;
            }
            if(mid == start){
                return start;
            }
            else if(mid * mid  == num) {
                return mid;
            }

        }
        return start ;
    }
}
