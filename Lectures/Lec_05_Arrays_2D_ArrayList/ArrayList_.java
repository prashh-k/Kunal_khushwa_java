package Lectures.Lec_05_Arrays_2D_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_ {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Syntax:
        ArrayList<Integer> list = new ArrayList<Integer>(5);


        /*
        //  Opeartions:
        list.add(22);
        list.add(20);
        list.add(3);

        list.set(0, 56);

        int a = list.get(2);

        list.remove(0);

        System.out.println(list.contains(20));
        System.out.println(list);

         */


        // Input

        for (int i = 0; i <5; i++){
            list.add(in.nextInt());
        }

        // output

        for (int i = 0; i <5; i++){
            System.out.println(list.get(i));
        }


        System.out.println(list);







    }
}
