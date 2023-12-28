package Lectures.Lec_03_switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//         //   Switch Syntax old
//
//          String fruit = input.next();
//        switch (fruit){
//            case "mango" :
//                System.out.println("King");
//                break;
//            case "apple" :
//                System.out.println("doctor");
//                break;
//            case "cherry" :
//                System.out.println("cute");
//                break;
//            case "orange" :
//                System.out.println("good");
//                break;
//            default :
//                System.out.println("not fruit");
//        }
//
//
//        //        Switch Syntax new
//
//        switch (fruit) {
//            case "mango" -> System.out.println("King");
//            case "apple" -> System.out.println("doctor");
//            case "cherry" -> System.out.println("cute");
//            case "orange" -> System.out.println("good");
//            default -> System.out.println("not fruit");
//
//        }


        //   With break
        int date = input.nextInt();
        switch (date){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
        }

        switch (date) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
        }

        //  Without Break
        switch (date){
            case 1,2,3,4,5 -> System.out.println("weekday");
            case 6,7 -> System.out.println("Weekend");
        }


        switch (date) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }



    }
}
