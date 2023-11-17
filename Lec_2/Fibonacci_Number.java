package Lec_2;

import java.util.Scanner;

public class Fibonacci_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q. Print the 'n' th Number in Fibonacci sequence

        int a = 0 ;
        int b = 1 ;
        int n = input.nextInt();

//        int result = 0;
//        for (int i=0;i<=n-2;i++) {
//            result = a + b;
//            a = b;
//            b = result;
//        }
//        System.out.println(result);

        int count = 2;
        while (count <= n){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.println(b);


    }
}
