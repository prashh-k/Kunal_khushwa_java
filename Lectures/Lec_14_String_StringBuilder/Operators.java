package Lectures.Lec_14_String_StringBuilder;

import java.util.* ;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');   // O/P => 195
        System.out.println("a" + "b");   // O/P => ab
        System.out.println((char)('a' + 3)); // O/P => 100

        System.out.println("a" + 1);  // O/P => a1
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Kunal" + new ArrayList<>());   // O/P => kunal[]
        System.out.println("Kunal" + 56);               // O/P => kunal56
        String ans = 56 + "" + new ArrayList<>();      // O/P => error
        System.out.println(ans);

        System.out.println("a" + 'b');              // O/P => ab
    }
}
