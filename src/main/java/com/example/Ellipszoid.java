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

public class Ellipszoid {
    public static double calcVolume(double a_side, double b_side, double c_side){
        double volume = 4/3*Math.PI*a_side*b_side*c_side;
        return volume;
    }
}
