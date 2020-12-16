package com.kodilla.testing.collection;

import com.kodilla.testing.calculator.CalculatorEnum;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.*;
import org.junit.*;


public class CollectionTestSuit {

    OddNumbersExterminator collection = new OddNumbersExterminator();
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    @Before
    public void before(){
        System.out.println("Test case: Begin");
    }
    @After
    public void after(){
        System.out.println("Test case: End");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //When
        list2 = collection.exterminate(list1);
        //Then
        Assert.assertEquals(0,list2.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        list1.add(8);
        list1.add(2);
        list1.add(5);
        list1.add(9);
        list1.add(4);
        //When
        list2 = collection.exterminate(list1);

        //Then
        Assert.assertEquals(3,list2.size());
    }
}
