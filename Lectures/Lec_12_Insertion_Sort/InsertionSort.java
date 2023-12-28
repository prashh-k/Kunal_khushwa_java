package Lectures.Lec_12_Insertion_Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,6};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void InsertionSort(int[] arr){

        for(int i = 0; i <= arr.length - 2 ;i++){
            for(int j= i+1; j > 0 ;j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                } else{
                    break;
                }
            }
        }



    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }



}

