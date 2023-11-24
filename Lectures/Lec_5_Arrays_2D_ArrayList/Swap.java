package Lec_5;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[7];

        for( int i = 0; i< arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        swap(arr, 3, 5);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] num, int index1, int index2){
        int temp = num[index1];
        num[index1] = num[index2];
        num[index2] = temp ;
    }
}
