package com.kodilla.testing.wheater;
import java.util.*;

public class WheaterForecast {
    Temperatures temperatures;
    public WheaterForecast(Temperatures temp){
        this.temperatures = temp;
    }
    public HashMap<Integer,Double> calculateForecast(){
        HashMap<Integer,Double> resultMap = new HashMap<>();
        //ciało metody
        for(Map.Entry<Integer,Double> temp : temperatures.getTemperatures().entrySet()){
            resultMap.put(temp.getKey(), temp.getValue()+1);
        }
        return resultMap;
    }
}
