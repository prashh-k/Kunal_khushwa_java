package Lectures.Lec_02_conditionals_loops;

import java.util.Scanner;



public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        //Q Find the largest of remaining

//        int max = a ;
//        if (max < b ){
//            max = b ;
//        }
//        else if (max<c) {
//            max = c;
//        }
//        System.out.println(max);
//

        //using math lib

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);

    }
}
