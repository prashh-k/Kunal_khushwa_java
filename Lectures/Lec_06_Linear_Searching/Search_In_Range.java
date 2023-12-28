package Lectures.Lec_06_Linear_Searching;

public class Search_In_Range{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 4;
        int start = 1 ;
        int end = 5 ;

        System.out.println(Linear_search(nums,target, start, end));
    }

    //  search in array: returns the index if item found
    //  otherwise if item not found return -1
    static int Linear_search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
