package Lectures.Lec_8_BS_Questions;

public class _852_Peak_index_mountain {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};

        int result = peakIndexInMountainArray(arr);
        System.out.println(result);
    }

    public static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start) / 2;
            if(arr[mid] < arr[mid-1]){
                end = mid;
            } else if (arr[mid] < arr[mid+1]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
