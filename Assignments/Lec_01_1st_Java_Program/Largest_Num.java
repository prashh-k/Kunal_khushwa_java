package Assignments.Lec_01_1st_Java_Program;

import java.util.Scanner;

public class Largest_Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        if (a < b) {
            System.out.println(b +" is a larger number.");
        } else if (a == b) {
            System.out.println("Both numbers are same");
        } else {
            System.out.println(a + " is a larger number.");
        }
    }
}
