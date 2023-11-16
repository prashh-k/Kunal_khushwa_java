package Lec_1;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ennter Temperature in Celcius: ");
        float C = input.nextFloat();
        float f = (C * 9/5 ) + 32 ;
        System.out.println("Temperature in F is " + f);
    }
}
