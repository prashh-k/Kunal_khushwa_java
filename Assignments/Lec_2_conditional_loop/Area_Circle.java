package Assignments.Lec_2_conditional_loop;

import java.util.Scanner;

public class Area_Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Radius = in.nextInt();
        float Area = (float) (3.142 * Radius * Radius);

        System.out.println(Area);
    }
}
