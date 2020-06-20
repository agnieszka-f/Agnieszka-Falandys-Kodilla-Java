package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.Calculator;

public class StreamMain {
    public static void main(String[] args){

        System.out.println("Moduł 7 - zadanie 1: ");

        PoemBeautifier beautifier1 = new PoemBeautifier();
        beautifier1.beautify("Ala ma kota a kot ma Ale", (text) -> text.toUpperCase());
        beautifier1.beautify("wlazł kotek na płotek", (text)-> text.replace("k", "K"));
        beautifier1.beautify("Król Karol kupił królowej Karolinie", (text)->text.substring(0,11));

    }
}
