package com.kodilla.testing.collection;

import java.util.*;
import org.junit.*;


public class CollectionTestSuit {

    OddNumbersExterminator collection = new OddNumbersExterminator();
    List<Integer> numbers = new ArrayList<>();
    List<Integer> evenNumbers = new ArrayList<>();

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
        evenNumbers = collection.exterminate(numbers);
        //Then
        Assert.assertEquals(0, evenNumbers.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        numbers.add(8);
        numbers.add(2);
        numbers.add(5);
        numbers.add(9);
        numbers.add(4);
        //When
        evenNumbers = collection.exterminate(numbers);

        //Then
        Assert.assertEquals(3, evenNumbers.size());
    }
}
