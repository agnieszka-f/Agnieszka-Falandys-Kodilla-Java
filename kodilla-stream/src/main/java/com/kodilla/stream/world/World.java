package com.kodilla.stream.world;
import java.util.*;
import java.math.*;

public final class World{
    final List<List<Country>> list;

    public World(){
        Continent continent = new Continent();
        list = Arrays.asList(continent.getAsiaList(),continent.getEuropeList(),continent.getAfricaList(),continent.getAmericaList());
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal result = list.stream()
                .flatMap(x -> x.stream())
                .map(x -> x.numberOfPeople())
                .reduce(BigDecimal.ZERO, (sum, x) -> sum.add(x));

        return result;
    }
    public void test(){
        System.out.println(list);
    }
}
