package Lectures.Lec_8_BS_Questions;

public class Floor_of_Number {
    public static void main(String[] args) {
        int[] nums = {2,4,6,9,12,34,67};
        int target = 17;

        System.out.println(ceiling(nums,target));
    }


    // Floor of Number = Greatest number smaller than Target number.
    public static int ceiling(int[] arr, int target){
        int start = 0 ;
        int end = arr.length -1;

        while(start <= end ){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return arr[mid];
            }
        }
        return arr[end];
    }
}
