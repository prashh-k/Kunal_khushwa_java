package Lectures.Lec_04_Function_Methods;

public class Shadowing {
    static int a = 10;    // This will shadowed at line 8

    public static void main(String[] args) {

        System.out.println(a);  //  --> 10
        int a;   // class variable at line 4 is shadowed by this

        a = 20;
        System.out.println(a);          //     --> 20

        fun();  //      --> 10
    }

    static void fun(){
        System.out.println(a);
    }
}
