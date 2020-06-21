package com.kodilla.stream.world;
import org.junit.*;
import java.math.BigDecimal;
import java.util.*;

public class WorldTestSuite {
    @Test
    public void test1(){
        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("Chiny", new BigDecimal("1330044605")));
        asia.addCountry(new Country("Japonia", new BigDecimal("127078679")));

        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Hiszpania", new BigDecimal("47737941")));
        europe.addCountry(new Country("Chorwacja", new BigDecimal("4470534")));

        Continent africa = new Continent("Africa");
        africa.addCountry(new Country("Egipt", new BigDecimal("100000408")));
        africa.addCountry(new Country("Libia", new BigDecimal("6448000")));

        Continent america = new Continent("America");
        america.addCountry(new Country("USA", new BigDecimal("323995528")));
        america.addCountry(new Country("Brazylia", new BigDecimal("210677000")));

        List<Continent> theList = new ArrayList<>();
        theList.add(asia);
        theList.add(europe);
        theList.add(africa);
        theList.add(america);

        World world = new World(theList);
        BigDecimal result = world.getPeopleQuantity();
        Assert.assertEquals(new BigDecimal("2150452695"), result);
    }
}
