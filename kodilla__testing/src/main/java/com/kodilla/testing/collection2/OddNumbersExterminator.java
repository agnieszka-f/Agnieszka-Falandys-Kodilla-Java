package com.kodilla.testing.collection2;

import java.util.*;

public class OddNumbersExterminator {
    List<Integer> list;

    public OddNumbersExterminator(){
        list = new ArrayList<>();
    }
    public List<Integer> exterminate(List<Integer> numbers){

        for(Integer i: numbers){
            if( i % 2 == 0){
                list.add(i);
            }
        }

        return list;
    }
}

