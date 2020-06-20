package com.kodilla.stream.array;
import java.util.stream.IntStream;
import java.util.OptionalDouble;
public final class MyClass implements ArrayOperations{

    public Double getAverage(int[] numbers){

        System.out.println("Wyświetlenie elementów tablicy:");
        IntStream.range(0,numbers.length)
                .map( i -> numbers[i])
                .forEach(System.out::println);

        OptionalDouble result = IntStream.range(0,numbers.length)
                .map( i -> numbers[i])
                .average();

        return result.getAsDouble();
    }
}
