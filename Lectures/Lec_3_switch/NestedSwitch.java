package Lec_3;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int empid = input.nextInt();
        String dept = input.next() ;

        //   Old Syntax :

        switch (empid){
            case 1 :
                System.out.println("Prashant Kharche");
                switch (dept){
                    case "IT" :
                        System.out.println("IT Department");
                        break;
                    case "Sales" :
                        System.out.println("Sales Department");
                        break;
                    case "management" :
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Enter Valid");
                }
                break;
            case 2 :
                System.out.println("Rahul rana");
                switch (dept){
                    case "IT" :
                        System.out.println("IT Department");
                        break;
                    case "Sales" :
                        System.out.println("Sales Department");
                        break;
                    case "management" :
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Enter Valid");
                }
                break;
            case 3 :
                System.out.println("Sarthak singh");
                switch (dept){
                    case "IT" :
                        System.out.println("IT Department");
                        break;
                    case "Sales" :
                        System.out.println("Sales Department");
                        break;
                    case "management" :
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Enter Valid");
                }
                break;
            default:
                System.out.println("Enter Valid");
        }


        //Better syntax :
        switch (empid) {
            case 1 -> {
                System.out.println("Prashant Kharche");
                switch (dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "Sales" -> System.out.println("Sales Department");
                    case "management" -> System.out.println("Management Department");
                    default -> System.out.println("Enter Valid");
                }
            }
            case 2 -> {
                System.out.println("Rahul rana");
                switch (dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "Sales" -> System.out.println("Sales Department");
                    case "management" -> System.out.println("Management Department");
                    default -> System.out.println("Enter Valid");
                }
            }
            case 3 -> {
                System.out.println("Sarthak singh");
                switch (dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "Sales" -> System.out.println("Sales Department");
                    case "management" -> System.out.println("Management Department");
                    default -> System.out.println("Enter Valid");
                }
            }
            default -> System.out.println("Enter Valid");
        }

    }
}

