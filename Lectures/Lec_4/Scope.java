package Lec_4;

public class Scope {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ;

        //Function Scope
//        System.out.println(marks);     // Since its declared outside of the main Function can't access it.



        { // block scope
//            int a = 10;     //already initialized outside the block so can't initialized again.
            a  = 20;          // But we can modify it.

            int c = 50;     // Values initialized in this block remains in this block.
        }

        int c = 100;    // can reinitialize the value declared inside the block.
//        System.out.println(c);   // cannot use outside the block


        // Loop scope   same as Block scope
        for(int i =0; i<4;i++) {       // 'i' is initialized here cant access it outside.
            System.out.println(i);
            int num = 20 ;              // same as 'i'
//            int b = 14 ;              // same as block scope cant be reinitialized in loop.
        }

    }



    static void random(int marks){
        int num = 67;

//        System.out.println(a);   // same here can't access the variable out of function.
        System.out.println(num);
        System.out.println(marks);
    }

}
