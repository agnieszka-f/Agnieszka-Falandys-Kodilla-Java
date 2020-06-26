package com.kodilla.testing.collection2;
import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {
        OddNumbersExterminator collection = new OddNumbersExterminator();

        List<Integer> list1  = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(8);
        list1.add(11);

        List<Integer> list2 = new ArrayList<>();
        list2 = collection.exterminate(list1);

        if(list2.size() != 0){
            System.out.println("Lista zawiera elementy - OK");
        } else {
            System.out.println("Lista jest pusta - błąd brak danych");
        }


        for(Integer i: list2){
            if(i % 2 == 0){
                System.out.println("Element parzysty: " + i);
            } else{
                System.out.println("Znaleziono element nieprzysty: " + i);
            }
        }
    }
}


