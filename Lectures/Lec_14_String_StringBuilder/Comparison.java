package Lectures.Lec_14_String_StringBuilder;

public class Comparison {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal";
        String c = a;

        // ==   :>  comparitor
        // Checks the value as well as reference value pointing to same object.
        System.out.println(c == a);   // O/P => True;
        System.out.println(a == b);   // O/P => True;

        String name1 = new String("Kunal");
        String name2 = new String("Kunal");
        // creates new object;
        System.out.println(name1 == name2);  // O/P => False;


        //  .equals()  => Comparitor
        //  only checks the value does not care about the reference variable pointing to object
        System.out.println(name1.equals(name2)); // O/P => True;

    }

}
