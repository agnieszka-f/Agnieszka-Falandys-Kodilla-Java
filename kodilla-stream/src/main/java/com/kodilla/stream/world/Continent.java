package com.kodilla.stream.world;
import java.util.*;
import java.math.*;

public final class Continent{
    final ArrayList<Country> listOfCountriesAsia = new ArrayList<>();
    final ArrayList<Country> listOfCountriesEurope = new ArrayList<>();
    final ArrayList<Country> listOfCountriesAfrica = new ArrayList<>();
    final ArrayList<Country> listOfCountriesAmerica = new ArrayList<>();

    public Continent(){
        listOfCountriesAsia.add(new Country("Chiny", new BigDecimal("1330044605")));
        listOfCountriesAsia.add(new Country("Japonia", new BigDecimal("127078679")));

        listOfCountriesEurope.add(new Country("Hiszpania", new BigDecimal("47737941")));
        listOfCountriesEurope.add(new Country("Chorwacja", new BigDecimal("4470534")));

        listOfCountriesAfrica.add(new Country("Egipt", new BigDecimal("100000408")));
        listOfCountriesAfrica.add(new Country("Libia", new BigDecimal("6448000")));

        listOfCountriesAmerica.add(new Country("USA", new BigDecimal("323995528")));
        listOfCountriesAmerica.add(new Country("Brazylia", new BigDecimal("210677000")));
    }
    public List<Country> getAsiaList(){
        return new ArrayList<>(listOfCountriesAsia);
    }
    public List<Country> getEuropeList(){
        return new ArrayList<>(listOfCountriesEurope);
    }
    public List<Country> getAfricaList(){
        return new ArrayList<>(listOfCountriesAfrica);
    }
    public List<Country> getAmericaList(){
        return new ArrayList<>(listOfCountriesAmerica);
    }
}
