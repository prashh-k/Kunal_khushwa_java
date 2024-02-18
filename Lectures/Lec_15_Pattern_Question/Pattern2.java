package Lectures.Lec_15_Pattern_Question;

public class Pattern2 {
    public static void main(String[] args) {

        pattern2( 3);
    }

    public static void pattern2(int n){

        for(int row =1; row <= n; row++ ){
            for(int col = 1; col<=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
