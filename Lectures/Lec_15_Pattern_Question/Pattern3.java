package Lectures.Lec_15_Pattern_Question;

public class Pattern3 {
    public static void main(String[] args) {

        pattern3(10);
    }

    public static void pattern3(int n){

        for(int row =1; row <= n; row++ ){
            for(int col = 1; col<=n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
