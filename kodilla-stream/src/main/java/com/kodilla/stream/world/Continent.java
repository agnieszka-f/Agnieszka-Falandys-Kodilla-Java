package com.kodilla.stream.world;
import java.util.*;
import java.math.*;

public final class Continent{
    final private String nameContinent;
    final private List<Country> listOfCountries = new ArrayList<>();

    public Continent(final String name){
        this.nameContinent = name;
    }
    public void addCountry(Country country){
        listOfCountries.add(country);
    }
    public List<Country> getListOfCountries(){
        return new ArrayList<>(listOfCountries);
    }
    public String getName(){
        return nameContinent;
    }

}