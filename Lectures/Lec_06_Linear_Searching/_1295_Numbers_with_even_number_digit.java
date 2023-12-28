package Lectures.Lec_06_Linear_Searching;

public class _1295_Numbers_with_even_number_digit {
    class Solution {
        public int findNumbers(int[] nums) {
            int count_even = 0;
            for( int i =0; i<nums.length;i++){
                int digit_count = 0 ;
                while (nums[i]>0){
                    nums[i] = nums[i] /10 ;
                    digit_count ++;
                }
                if(digit_count % 2 == 0 ){
                    count_even ++;
                }
            }
            return count_even;
        }
    }}
