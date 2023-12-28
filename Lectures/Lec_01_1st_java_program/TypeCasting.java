package Lectures.Lec_01_1st_java_program;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        //  Typecasting and narrowing conversion
//        int num = (int) (67.34f);
//        System.out.println(num);


        //  Automatic Type promotion in Expression

//        int a = 257;
//        byte b = (byte) (a) ; // As byte can only store values upto 256
//        System.out.println(b);  // Output will be remainder,  257 % 256 = 1

        byte a = 40 ;
        byte b = 50 ;
        byte c = 100 ;
        int d = (a * b) / c ;
        System.out.println(d);  //output will be in int due to auto promotion in expression

        //Character type conversion

        int number = 'a' ;
        System.out.println(number); //output will be ASCII value of 'a' which is 97


    }
}
