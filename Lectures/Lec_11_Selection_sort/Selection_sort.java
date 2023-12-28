package Lectures.Lec_11_Selection_sort;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){


        for (int i = 0; i< arr.length; i++){
            int Last = arr.length - i - 1;
            int MaxElement = maxElement(arr, 0, Last);

            swap(arr,MaxElement, Last);
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static int maxElement(int[] arr,int start,int end){
        int max = start;
        for (int i =start; i<= end;i++){
            if(arr[max] < arr[i]){
                max = i ;
            }
        }
        return max;
    }


}
