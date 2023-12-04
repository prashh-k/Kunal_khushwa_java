package Assignments.Lec_2_conditional_loop;

import java.util.Scanner;

public class Area_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Float side = in.nextFloat();

        double Area = side * side * (Math.sqrt(3))/ 4;
        System.out.println(Area);
    }
}
