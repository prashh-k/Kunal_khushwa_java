package Assignments.Lec_1_1st_Java_Program;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " is a even Number.");
        }
        else {
            System.out.println(num + " is odd Number.");
        }

    }
}
