/*
* File: Ellipszoid.java
* Author: Csorba Péter
* Copyright: 2026, Csorba Péter
* Group: Szoft I/N
* Date: 2026-04-24
* Github: https://github.com/Gunkhu
* Licenc: MIT
*/
package com.example;

import java.util.InputMismatchException;

public class Ellipszoid {
    public static double calcVolume(double a_side, double b_side, double c_side){

        if(a_side <= 0 || b_side <=0 || c_side <=0){
            throw new InputMismatchException();
        }
        if(a_side >= 1000001 || b_side >= 1000001 || c_side >= 1000001){
            throw new InputMismatchException();
        }

        double volume = (4.0/3.0)*Math.PI*a_side*b_side*c_side;
        return volume;
    }
}
