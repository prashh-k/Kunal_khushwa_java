package Lectures.Lec_14_String_StringBuilder;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "a" ;

        System.out.println(palindrome(str));
    }

    public static boolean palindrome(String str){
        boolean palin =true;

        for(int i=0; i<= str.length() /2 ;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                palin = false;
            }
        }
        return palin;

    }
}
