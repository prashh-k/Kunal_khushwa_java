package Assignments.Lec_2_conditional_loop;

import java.util.Scanner;

public class Perimeter_CIrcle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double Rad = in.nextDouble();

        double Perimeter = 2 * 3.142 * Rad ;
        System.out.println(Perimeter);
    }
}
