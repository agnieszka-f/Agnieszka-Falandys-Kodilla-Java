package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import java.util.*;
import com.kodilla.stream.forumuser.*;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args){

        System.out.println("Moduł 7 - zadanie 1: ");

        PoemBeautifier beautifier1 = new PoemBeautifier();
        beautifier1.beautify("Ala ma kota a kot ma Ale", (text) -> text.toUpperCase());
        beautifier1.beautify("wlazł kotek na płotek", (text)-> text.replace("k", "K"));
        beautifier1.beautify("Król Karol kupił królowej Karolinie", (text)->text.substring(0,11));

        System.out.println("Moduł 7 - zadanie 3: ");

        Forum forum = new Forum();

        Map<Integer,ForumUser> result = forum.getUserList().stream()
                .filter(x -> x.getSex() == 'M')
                .filter(x -> 2020 - x.getDate().getYear() > 20 )
                .filter(x -> x.getQuantity() >= 1)
                .collect(Collectors.toMap(x -> x.getId(), x -> x));

        result.entrySet()
                .stream()
                .map(x -> "id:" + x.getKey() + " - " + x.getValue())
                .forEach(x -> System.out.println(x));

    }
}
