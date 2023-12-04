package Assignments.Lec_2_conditional_loop;

import java.util.Scanner;

public class Perimeter_square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double side = in.nextDouble();

        double Perimeter = 4 * side ;

        System.out.println(Perimeter);

    }
}
