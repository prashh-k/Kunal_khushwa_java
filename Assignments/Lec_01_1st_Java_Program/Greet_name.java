package Assignments.Lec_01_1st_Java_Program;

import java.util.Scanner;

public class Greet_name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String Name = in.next();
        if(Name.equals("Ram")){
            System.out.println("Welcome Ram !!");
        }
        else {
            System.out.println("You are Not an Ram !!");
        }

    }
}
