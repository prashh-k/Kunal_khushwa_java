package Lec_4;

public class Swap {
    public static void main(String[] args) {
        int num1 = 33;
        int num2 = 23;
        swap(num1, num2);
    }
    static void swap(int a, int b){
        int temp = a;
        a = b ;
        b = temp;
                // This change will only valid in function scope.
    }
}
