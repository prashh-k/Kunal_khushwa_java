package Lec_2;

import java.util.Scanner;

public class Reverse_Int {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//          Q. Reverse the number digit

        int num = input.nextInt();
        int reverse = 0;
        while (num > 0 ){
            int rem = num % 10 ;
            reverse = reverse * 10 + rem;
            num = num / 10 ;
        }
        System.out.println(reverse);

    }
}
