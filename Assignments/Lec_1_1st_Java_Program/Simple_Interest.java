package Assignments.Lec_1_1st_Java_Program;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int p = in.nextInt();
        System.out.println("In percentage rate: ");
        float r = in.nextInt();
        System.out.println("In year Time : ");
        int t = in.nextInt();
        float si;
        si = p * (1 + ((r/100) * t));

        System.out.println(si);
    }
}
