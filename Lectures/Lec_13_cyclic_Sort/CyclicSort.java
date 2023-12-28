package Lectures.Lec_13_cyclic_Sort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {6,3,5,1,4,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void cyclicSort(int[] arr){

        int i =0;
        while(i< arr.length){
            int correct = arr[i] -1 ;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
                }
            }
    }


    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
