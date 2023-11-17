package Lec_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
            For Loop
            Syntax :
            for( initialization; Condition; Inc/Decrement ) {
                //body
            }
        */

        //Q  Print number from 1 to 5
        for (int num =1; num <= 5; num++) {
            System.out.println(num + " ");
        }

        // print number from 1 to n
        Scanner in = new Scanner(System.in) ;
        int n = in.nextInt();
        for (int i =1; i <= n ; i++){
            System.out.println(i + " ");
        }


        //      While Loops
        /*  Syntax:
            while(condition){
            //body
            }

         */

        int i = 1;                          //  Initialization
        while(i<= 5) {                      //Condition
            System.out.println(i);
            i++;                            //Inc / Decrement
        }

        //Do-while Loop
        /*
            Syntax:
                do {
                    //body
                } while (condition) ;
         */

        int a = 1 ;
        do {
            System.out.println(a) ;
        } while (a != 1) ;
    }
}
