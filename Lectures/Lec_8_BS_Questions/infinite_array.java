package Lectures.Lec_8_BS_Questions;

public class infinite_array {public static void main(String[] args) {
    int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89,90,93,95,97,99,100};
    int target = 22;
    int ans = infinitesearch(arr, target);
    System.out.println(ans);
    }

    static int infinitesearch(int[] arr, int target){
        // 1st find the range
        // 1st start with box of size 2
        int start = 0;
        int end = 1;

        // condition for target to lie in a range
        while (target > arr[end]) {
            int tempstart = end+1 ; // new start
            // double the box value
            // new end = previous end + sizeoffbox * 2
            end = end + (end - start +1) * 2;
            start = tempstart;
        }

        return binarySearch(arr,target,start,end);

    }


    static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
