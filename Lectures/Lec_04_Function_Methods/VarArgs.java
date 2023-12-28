package Lectures.Lec_04_Function_Methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7);
        multiple_arg(1, "Prashant", 'a','b','c','d','f','r','g');
    }


    static void multiple_arg(int a,String b,char ...c){
        System.out.println(a + " " + b +" "+ Arrays.toString(c));
    }

    static void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }
}
