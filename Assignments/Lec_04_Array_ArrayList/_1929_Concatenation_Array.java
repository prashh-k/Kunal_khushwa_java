package Assignments.Lec_04_Array_ArrayList;

import java.util.Arrays;

public class _1929_Concatenation_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println(Arrays.toString(concatenation(arr)));

    }
    static int[] concatenation(int[] nums){
        int[] ans = new int[2 * nums.length];

        for (int i = 0; i < nums.length;i++){
            ans[i] = nums[i];
        }

        for (int i = nums.length; i < ans.length; i++){
            ans[i] = nums[i - nums.length];
        }

        return ans;
    }
}
