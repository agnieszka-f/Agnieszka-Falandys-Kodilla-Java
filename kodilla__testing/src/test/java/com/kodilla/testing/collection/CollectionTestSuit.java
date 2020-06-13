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
        list1.add(8);
        list1.add(2);
        list1.add(5);
        list1.add(9);
        list1.add(4);

        list2 = collection.exterminate(list1);

        if(list2.size() != 0){
            System.out.println("Lista zawiera elementy. Liczba elementów: " + list2.size());
            testOddNumbersExterminatorNormalList();
        } else {
            System.out.println("Lista jest pusta - błąd brak danych");
        }
    }
    public void testOddNumbersExterminatorNormalList(){

        for(Integer i: list2){
            if(i % 2 == 0){
                System.out.println("Element parzysty: " + i);
            } else{
                System.out.println("Znaleziono element nieprzysty: " + i);
            }
        }
    }
}
