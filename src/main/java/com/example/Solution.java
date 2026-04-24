package com.example;

import java.util.Scanner;

public class Solution {
    public static void inputValue(){
        Scanner sc = new Scanner(System.in);


        System.out.print("Adja meg az |A| oldalt: ");
        String a_sideStr = sc.nextLine();
        double a_side = Double.parseDouble(a_sideStr);

        System.out.print("Adja meg az |B| oldalt: ");
        String b_sideStr = sc.nextLine();
        double b_side = Double.parseDouble(b_sideStr);

        System.out.print("Adja meg az |C| oldalt: ");
        String c_sideStr = sc.nextLine();
        double c_side = Double.parseDouble(c_sideStr);

        
        double volume = Ellipszoid.calcVolume(a_side, b_side, c_side);
        System.out.println(volume);


        sc.close();

    }
}
