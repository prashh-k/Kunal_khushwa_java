package Lectures.Lec_6_Linear_Searching;

public class String_Searching {
    public static void main(String[] args) {
        String str1 = "Prashant" ;

        char target = 'r' ;

        System.out.println(String_search(str1,target));
    }

    static int String_search(String str, char target){
        if (str.length() == 0){
            return -1;
        }
        for(int i =0; i < str.length();i++){
            if (target == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}
