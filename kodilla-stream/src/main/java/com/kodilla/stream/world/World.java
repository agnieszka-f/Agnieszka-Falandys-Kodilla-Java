package com.kodilla.stream.world;
import java.util.*;
import java.math.*;

public final class World{

    private final List<Continent> list;

    public World(final List<Continent> list){
        this.list = new ArrayList<>(list);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal result = list.stream()
                .flatMap(x -> x.getListOfCountries().stream())
                .map(x -> x.numberOfPeople())
                .reduce(BigDecimal.ZERO, (sum, x) -> sum.add(x));

        return result;
    }
}