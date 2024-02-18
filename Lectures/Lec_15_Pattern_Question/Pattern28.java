package Lectures.Lec_15_Pattern_Question;

//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *


public class Pattern28 {
    public static void main(String[] args) {

        pattern28(5);
    }

    public static void pattern28(int n){

        for(int row =0; row <= 2*n; row++ ){
//            int col_in_row;
//            if(row>n){
//                col_in_row=2*n-row;
//            }else {
//                col_in_row=row;
//            }
            int col_in_row = row > n ? 2*n -row : row;

            int noOfspaces = n - col_in_row  ;

            for (int s = 0; s<= noOfspaces;s++){
                System.out.print(" ");
            }
            for(int col= 0; col < col_in_row  ;col++){
                System.out.print("* ");
            }
            System.out.println( );

        }
    }
}