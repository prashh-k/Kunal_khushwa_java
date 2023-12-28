package Assignments.Lec_01_1st_Java_Program;

import java.util.Scanner;

public class Currency_IND_USD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("If IND to USD type IU else type UI :");
        String CurrencyChange = in.next();
        System.out.println("Enter Value: ");
        float Val = in.nextFloat();

        if (CurrencyChange.equals("IU")){
            Val = Val / 83 ;
        } else if (CurrencyChange.equals("UI")){
            Val = Val * 83 ;
        }
        System.out.println(Val);

    }
}
