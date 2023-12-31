package Lectures.Lec_14_String_StringBuilder;

public class Performance_String {
    public static void main(String[] args) {
        String series = "";

        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series = series + ch; // series += ch
        }

//        for i=0; => series =  "" + 'a' = "a"
//        for i=1; => series = "a" + 'b' = "ab"
//        for i=2; => series = "ab" + 'c' = "abc"
//                ...
//        for i=1; => series = "abcd...vwx" + 'y' = "abcd...vwxy"
//        for i=25; => series = "abcd...wxy" + 'z' = "abcd...wxyz"

//        here, lots of memory is getting waste beacause the immutable nature of string.
//        string is not modifing itself it's just creating new object of string.
//        time  complexity of this is O(n²)
//        Solution is StringBuilder and StringBuffer


        System.out.println(series);
    }
}
