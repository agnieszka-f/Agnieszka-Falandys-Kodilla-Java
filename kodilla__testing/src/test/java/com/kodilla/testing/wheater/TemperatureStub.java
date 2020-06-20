package com.kodilla.testing.wheater;
import java.util.*;

public class TemperatureStub implements Temperatures{
    public HashMap<Integer,Double> getTemperatures(){
        HashMap<Integer,Double> resultStub = new HashMap<>();

        resultStub.put(0, 28.4);
        resultStub.put(1, 23.4);
        resultStub.put(2, 22.4);
        resultStub.put(3, 21.0);
        resultStub.put(4, 24.4);

        return resultStub;
    }
}
