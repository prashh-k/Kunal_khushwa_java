package Lectures.Lec_01_1st_java_program;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is your age :");
        Scanner input = new Scanner(System.in);
        System.out.println("Your age is " + input.nextInt());
    }
}