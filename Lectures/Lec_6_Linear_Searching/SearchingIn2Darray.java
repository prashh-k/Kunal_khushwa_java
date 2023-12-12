package Lectures.Lec_6;

import java.util.Arrays;

public class SearchingIn2Darray {
    public static void main(String[] args) {
        int[][] nums = {
                {1,2,3,4},
                {7,8,9,14},
                {23,24,25}
        };
        int target = 9 ;


        System.out.println(Arrays.toString(Linear_search(nums,target)));
    }

    static int[] Linear_search(int[][] arr, int target) {
        for (int row = 0; row <arr.length;row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target) {
                    return new int[] {row, col} ;
                }
            }
        }
    return new int[] {-1,-1};
    }

}
