/*
* File: Solution.java
* Author: Csorba Péter
* Copyright: 2026, Csorba Péter
* Group: Szoft I/N
* Date: 2026-04-24
* Github: https://github.com/Gunkhu
* Licenc: MIT
*/
package com.example;

import java.util.Scanner;

public class Solution {
    public static void inputValue(){
        Scanner sc = new Scanner(System.in);


        System.out.print("Adja meg az |A| oldalt: ");
        double a_side = sc.nextDouble();
        System.out.print("Adja meg az |B| oldalt: ");
        double b_side = sc.nextDouble();

        System.out.print("Adja meg az |C| oldalt: ");
        double c_side = sc.nextDouble();


        double volume = Ellipszoid.calcVolume(a_side, b_side, c_side);
        System.out.println(volume);


        sc.close();

    }
}
