package com.streams;

import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        // Stream API - Collection/ group of objects process

        //empty stream creation
        Stream<Object> emptyStream = Stream.empty();
        //Array of names
        String [] names = {"Abhishek", "Divakar", "Deepak", "Priya", "Rahul", "Swayam"};
//        for (String i : names) {
//            System.out.println(i);
//        }

        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> {System.out.println(e);});

    }
}
