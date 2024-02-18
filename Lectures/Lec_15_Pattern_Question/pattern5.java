package Lectures.Lec_15_Pattern_Question;

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

public class pattern5 {
    public static void main(String[] args) {

        pattern4(5);
    }

    public static void pattern4(int n){

        for(int row =0; row <= 2*n; row++ ){
//            int col_in_row;
//            if(row>n){
//                col_in_row=2*n-row;
//            }else {
//                col_in_row=row;
//            }
            int col_in_row = row > n ? 2*n -row : row;
            for(int col= 0; col < col_in_row  ;col++){
                System.out.print("* ");
            }
            System.out.println( );

        }
    }
}
