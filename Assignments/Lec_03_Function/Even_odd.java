package Assignments.Lec_03_Function;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        even_odd(a);
    }
    static void even_odd(int num){
        if(num % 2 == 0 ){
            System.out.println(num + " is Even.");
        }
        else{
            System.out.println(num + " is Odd");
        }
    }
}
