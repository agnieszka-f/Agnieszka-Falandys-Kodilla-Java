package com.kodilla.exception.index;
import java.util.*;

public class IndexExceptionRunner {

    public static void main(String[] args) {
        VideoCollector videoCollector = new VideoCollector();
        List<String> collection = videoCollector.getCollection();

        String movie = collection.get(0);
        String movie2 = collection.get(1);

        System.out.println(movie);
        System.out.println(movie2);
    }

}
