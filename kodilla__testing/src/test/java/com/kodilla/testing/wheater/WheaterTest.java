package com.kodilla.testing.wheater;

import org.junit.Test;
import java.util.*;
import org.junit.*;

public class WheaterTest {
    @Test
    public void test1(){
        Temperatures temperatures = new TemperatureStub();
        WheaterForecast wheaterForecast = new WheaterForecast(temperatures);

        HashMap<Integer,Double> temp = wheaterForecast.calculateForecast();
        int sizeMap = temp.size();

        if( sizeMap == 5) System.out.println("test pass");
        else System.out.println("test fail");

        Assert.assertEquals(5, sizeMap);
        
    }
}
