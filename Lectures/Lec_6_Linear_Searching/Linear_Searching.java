package Lectures.Lec_6_Linear_Searching;

public class Linear_Searching {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 6;


        System.out.println(Linear_search(nums,target));
    }

    //  search in array: returns the index if item found
    //  otherwise if item not found return -1
    static int Linear_search(int[] arr, int target){
        if (arr.length == 0 ){
            return -1 ;
        }
        for (int i = 0; i < arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
