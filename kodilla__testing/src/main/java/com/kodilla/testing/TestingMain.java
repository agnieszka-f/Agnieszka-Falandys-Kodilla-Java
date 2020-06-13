package com.kodilla.testing;
import com.kodilla.testing.calculator.CalculatorEnum;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.*;

public class TestingMain {
    public static void main(String[] args){

        OddNumbersExterminator collection = new OddNumbersExterminator();

        List<Integer> list1 = new ArrayList<>();
        list1.add(8);
/*Test klasy Calculator *//*
        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(2,4);
        int resultSubtract = calculator.subtract(2,4);

        System.out.println("Test  " + calculator.getClass());
        System.out.println("Działania na liczbach: 2 i 4 - Wynik dodawania: " + resultAdd + ", wynik odejmowania: " + resultSubtract);

        if(resultAdd == 6 && resultSubtract == -2){
            System.out.println("Wyniki działań poprawne ");
        } else {
            System.out.println("Wyniki działań są błędne ");
        }

        int resultAddEnum = CalculatorEnum.ADD.operations(2,4);
        int resultSubtractEnum = CalculatorEnum.SUBTRACT.operations(2,4);

        System.out.println("Test  " + CalculatorEnum.class);
        System.out.println("Działania na liczbach: 2 i 4 - Wynik dodawania: " + resultAddEnum + ", wynik odejmowania: " + resultSubtractEnum);

        if(resultAddEnum == 6 && resultSubtractEnum == -2){
            System.out.println("Wyniki działań poprawne ");
        } else {
            System.out.println("Wyniki działań są błędne ");
        }


/* Test klasy SimpleUser */ /*
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }*/


    }
}
