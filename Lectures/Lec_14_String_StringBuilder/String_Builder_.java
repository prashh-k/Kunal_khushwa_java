package Lectures.Lec_14_String_StringBuilder;

public class String_Builder_ {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }

//      it create the mutable strings that can modify.
//      the Strings crated in StringBuilder can grow and shrink in size
//      In above example the at every  loop  the string is not created it is modifies.
//      the time complexity is O(n).
//      not useful when dealing with multithreading.
//      For multithreading StringBuffer is used.


        System.out.println(builder.toString());

        builder.reverse();
        System.out.println(builder);
    }
}
