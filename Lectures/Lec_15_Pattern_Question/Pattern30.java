package Lectures.Lec_15_Pattern_Question;

//               1
//             2 1 2
//           3 2 1 2 3
//         4 3 2 1 2 3 4
//       5 4 3 2 1 2 3 4 5

public class Pattern30 {
    public static void main(String[] args) {

        pattern30(5);
    }

    public static void pattern30(int n){

        for(int row =0; row <= n; row++ ){
//            int col_in_row;
//            if(row>n){
//                col_in_row=2*n-row;
//            }else {
//                col_in_row=row;
//            }

            int noOfspaces = n - row  ;

            for (int s = 0; s<+ noOfspaces;s++){
                System.out.print("  ");
            }
            for(int col= row; col >=1  ;col--){
                System.out.print(col + " ");
            }
            for(int col= 2; col<=row; col++){
                System.out.print(col + " ");
            }
            System.out.println( );

        }
    }
}
