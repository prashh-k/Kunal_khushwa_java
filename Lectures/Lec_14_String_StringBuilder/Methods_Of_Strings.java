package Lectures.Lec_14_String_StringBuilder;

import java.util.*;

public class Methods_Of_Strings {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'))
        ;
        System.out.println("     Kunal   ".strip());
        System.out.println("     Kunal   ".stripLeading());
        System.out.println("     Kunal   ".stripTrailing());

        System.out.println(Arrays.toString(name.split(" ")));
    }

}
