package Lectures.Lec_04_Function_Methods;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();


        greet();

        greet_name(name);


    }
    static void greet(){                         // Without Parameter Argument
        System.out.println("Hello");
    }

    static void greet_name(String a){                // With Parameter Argument
        System.out.println("Hello "+ a);
    }
}
