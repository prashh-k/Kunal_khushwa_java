package Lec_4;

public class OverLoading {
    public static void main(String[] args) {
        sum(0,1);
        sum("prashant", "ram");
        sum(4,7,3);
    }

    static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    static void sum(int a, int b){
        System.out.println(a + b);
    }
    static void sum(String a, String b){
        System.out.println(a + " " + b);
    }
}
