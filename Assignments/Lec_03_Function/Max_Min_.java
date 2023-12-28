package Assignments.Lec_03_Function;

import java.util.Scanner;

public class Max_Min_ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(max(a,b,c));
        System.out.println(min(a,b,c));
    }

    static int max(int num1, int num2, int num3){
        int max = num1;
        if(num1 < num2) {
            max = num2;
            if (num2 < num3) {
                max = num3;
            }
        }
        return max ;
    }

    static int min(int num1, int num2, int num3){
        int min = num1;
        if(num1 > num2) {
            min = num2;
            if (num2 > num3) {
                min = num3;
            }
        }
        return min ;
    }
}
