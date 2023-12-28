package Assignments.Lec_02_conditional_loop;

import java.util.Scanner;

public class Area_Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Length = in.nextInt();
        int Width = in.nextInt();

        int Area = Length * Width;
        System.out.println(Area);
    }
}
