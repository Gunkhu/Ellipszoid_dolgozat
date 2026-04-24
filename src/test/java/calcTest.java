/*
* File: calcTest.java
* Author: Csorba Péter
* Copyright: 2026, Csorba Péter
* Group: Szoft I/N
* Date: 2026-04-24
* Github: https://github.com/Gunkhu
* Licenc: MIT
*/
import java.util.InputMismatchException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.Ellipszoid;

public class calcTest {
    @Test
    public void testCalcVolume_30_40_30(){
        double actual = Ellipszoid.calcVolume(30, 40, 30);
        double expected = 150796.44737231004;

        Assert.assertEquals(actual, expected,0.01);
    }
    @Test
    public void testCalcVolume_25_40_45(){
        double actual = Ellipszoid.calcVolume(25, 40, 45);
        double expected = 188495.5592153876;

        Assert.assertEquals(actual, expected,0.01);
    }
    @Test
    public void testCalcVolume_1000000_30_30(){
        double actual = Ellipszoid.calcVolume(1000000, 30, 30);
        double expected = 3769911184.3077517;

        Assert.assertEquals(actual, expected,0.01);
    }
    

    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcVolume_0_30_30(){
        Ellipszoid.calcVolume(0, 30, 30);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcVolume_30_0_30(){
        Ellipszoid.calcVolume(30, 0,30);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcVolume_30_30_0(){
        Ellipszoid.calcVolume(30, 30, 0);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcVolume_1000001_30_30(){
        Ellipszoid.calcVolume(1000001, 30, 30);
    }

}