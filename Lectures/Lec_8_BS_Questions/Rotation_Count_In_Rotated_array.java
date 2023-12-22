package Lectures.Lec_8_BS_Questions;


//        Given an array arr[] of size N having distinct numbers sorted in increasing order and the array has been right
//        rotated (i.e, the last element will be cyclically shifted to the starting position of the array) k number of
//        times, the task is to find the value of k.

public class Rotation_Count_In_Rotated_array {
    public static void main(String[] args) {
        int[] arr = {15,18,2,3,6,12};

        System.out.println(Rotation_count(arr));

    }

    // Here the Rotation count will be the index of pivot (Highest element) + 1 .
    public static int Rotation_count(int[] arr){
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                // 4 cases over here
                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid + 1;
                }
                if (mid > start && arr[mid] < arr[mid - 1]) {
                    return (mid-1) + 1;
                }
                if (arr[mid] <= arr[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
    }
}
