package Assignments.Lec_2_conditional_loop;

import java.util.Scanner;

public class Area_Isosceles_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int height = in.nextInt();
        int base = in.nextInt();

        int Area = (height * base)/ 2;
        System.out.println(Area);
    }
}
