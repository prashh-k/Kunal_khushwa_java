package Lec_5;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensional_ArrayList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        // Syntax:
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        ///Initialization
        for( int i = 0 ;i < 3; i++){
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);

    }
}
