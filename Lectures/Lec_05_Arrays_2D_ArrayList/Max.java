package Lectures.Lec_05_Arrays_2D_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[7];

        for( int i = 0; i< arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(max(arr));
        System.out.println(maxinrange(arr, 3,6 ));

    }


    static int maxinrange(int[] nums, int index1, int index2){
        int max = nums[index1] ;
        for(int i = index1; i < index2 + 1 ; i++ ){
            if (max < nums[i]){
                max = nums[i];
            }
        } return max;
    }
    static int max(int[] nums){
        int max = nums[0] ;
        for(int i = 0; i < nums.length; i++ ){
            if (max < nums[i]){
                max = nums[i];
            }
        } return max;
    }
}
