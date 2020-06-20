package com.kodilla.stream.world;
import org.junit.*;
import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void test1(){
        World world = new World();
        BigDecimal result = world.getPeopleQuantity();

        Assert.assertEquals(new BigDecimal("2150452695"), result);
    }
}
