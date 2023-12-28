package Lectures.Lec_02_conditionals_loops;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Q. Count the digit in number

        int num = input.nextInt();
        int n = input.nextInt();

        int count = 0;
        while(num > 0 ){
            int rem = num%10;
            if(rem == n){
               count++;
            }
            num = num/10 ;
        }

        System.out.println(count);

    }
}
