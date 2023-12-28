package Assignments.Lec_03_Function;

import java.util.Scanner;

public class Age_To_Vote {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        int age = in.nextInt();

        To_Vote(age);
    }

    public static void To_Vote(int age) {
        if (age < 0){
            System.out.println("Enter Valid age.");
        } else if (age < 18){
            System.out.println("You are not eligible.");
        } else if (age > 18){
            System.out.println("You are eligible to vote.");
        }

    }

}
