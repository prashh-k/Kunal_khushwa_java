package Lectures.Lec_02_conditionals_loops;

public class Conditionals {
    public static void main(String[] args) {
        /*
            syntax of if-else statement :
            if (boolean expression Tor F) {
                body
            } else {
                body
            }
        */
        int salary = 25400;

        if (salary > 10000 ){
            salary = salary + 2000 ;
        }
        else {
            salary = salary + 1000 ;
        }
        System.out.println(salary);

        //Multiple if-else statement :

        if (salary > 10000 ) {
            salary = salary + 1000 ;
        }
        else if (salary >30000) {
            salary = salary + 3000 ;
        }
        else {
            salary += 1000 ;
        }

        //Logical Operators in Conditionals  
        
        int a = 10 ;
        int b = 40 ;

        if (a == 10 && b == 10 ){
            System.out.println("False");
        }
        else if (a == 10 || b == 10 ){
            System.out.println("True");
        }
        else if (a != 10){
            System.out.println("False");
        }
    }
}
