package Lec_4;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,56,6};

        changevalue(arr);

        System.out.println(Arrays.toString(arr));

    }
    static void changevalue(int nums[]) {
        nums[0] = 100 ;
    }
}
