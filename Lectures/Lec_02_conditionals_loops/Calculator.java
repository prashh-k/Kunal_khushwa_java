package Lectures.Lec_02_conditionals_loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("Enter Operator: ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter Number 1: ");
                int num1 = input.nextInt();

                System.out.println("Enter Number 2: ");
                int num2 = input.nextInt();
                if (op == '+'){
                    ans = num1 + num2;
                } else if (op == '-'){
                    ans = num1 - num2;
                } else if (op == '*'){
                    ans = num1 * num2;
                } else if (op == '/') {
                    ans = num1 / num2;
                } else if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                System.out.println("Closing the Preogram.");
                break;
            } else {
                System.out.println("Invalid Operator.");
                break;
            }
            System.out.println(ans);
        }
    }
}
