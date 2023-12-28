package Assignments.Lec_02_conditional_loop;

import java.util.Scanner;

public class Area_Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Float Dia1 = in.nextFloat();
        Float Dia2 = in.nextFloat();

        Float Area = (Dia1 * Dia2) / 2 ;

        System.out.println(Area);

    }
}
