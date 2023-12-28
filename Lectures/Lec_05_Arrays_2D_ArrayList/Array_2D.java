package Lectures.Lec_05_Arrays_2D_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {

    /*
    // Representation as matrix  :
                                    1   2   3
                                    4   5   6
                                    7   8   9

       syntax :
                Datatype [][]  variable_name = new Datatype[row_size][column_size];     // Column size is optional
                            OR
                Datatype [][]  variable_name =  {
                                                    {1,2,3},
                                                    {4,5,6},
                                                    {7,8,9}
                                                }
     */

        Scanner in = new Scanner(System.in);

//        int [][] arr = new int[3][3];
        int [][] arr =  {
                {1,2,3},    // 0th index
                {4,5,6},    // 1st index
                {7,8,9}     // 2nd index
        }   ;


        // Input

        int[][] num = new int[3][3];

        System.out.println(num.length) ;     // For the no of rows

        for (int row = 0; row < num.length; row++) {

            for (int col = 0; col < num[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }


        //Output

        for (int row = 0; row < num.length; row++){

            for(int col=0; col < num[row].length;col++){
                System.out.println(arr[row][col] + " ");
            }
            System.out.println();
        }


        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

     }
}
