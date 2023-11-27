package Lec_5;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[6];

        for( int i = 0; i< arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

        in.close();
    }

    static void reverse(int[] num) {
        for (int i =0; i< num.length /2; i++){
           swap(num,i, num.length-1-i);
        }
    }

    static void swap(int[] num, int index1, int index2){
        int temp = num[index1];
        num[index1] = num[index2];
        num[index2] = temp ;
    }


}
