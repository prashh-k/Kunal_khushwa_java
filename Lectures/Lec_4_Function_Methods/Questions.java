package Lec_4;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        boolean ans ;

//        ans = armstrong(a);
        ans = isprime(a);



        System.out.println(ans);
    }


    static boolean isprime(int num){
        if (num <= 1){
            return false;
        }

        int c = 2;
        while ( c*c <= num){
            if (num % c == 0){
                return false;
            }
            c++;
        }
        return c * c > num ;
    }


    static boolean armstrong(int num){
        int sum = 0;
        int copy = num ;
        while(num>0){
            int rem = num % 10 ;
            num = num /10 ;

            sum = sum + rem*rem*rem ;
        }
        if (copy == sum) {
            return true ;
        }
        else {
            return false ;
        }
    }
}
