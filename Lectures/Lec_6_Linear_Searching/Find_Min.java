package Lectures.Lec_6;

public class Find_Min {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,-6,7,8,9};

        System.out.println(Linear_search(nums));
    }

    //  search in array: returns the index if item found
    //  otherwise if item not found return -1
    static int Linear_search(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
