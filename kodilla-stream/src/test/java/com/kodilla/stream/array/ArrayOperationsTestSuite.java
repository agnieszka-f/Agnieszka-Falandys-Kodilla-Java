package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        int [] tab = {2,15,23,56,34,12,67,33,23,87,34,12,43,78,23,45,67,89,45,37};

        MyClass num = new MyClass();

        Double average = num.getAverage(tab);

        System.out.println("Srednie elementów tablicy: " + average);

        Assert.assertEquals(new Double(41.25), average);
    }
}
