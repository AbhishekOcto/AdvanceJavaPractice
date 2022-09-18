package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        //create a list and filter all even numbers from the list
        //3 ways I have created list
        List<Integer> list1 = List.of(1,3,22,44,65,89,90,92);
//        System.out.println(list1);

//       List<Integer> list3 = Arrays.asList(1,3,22,44,65,89,90,92);
//        System.out.println(list3);
//
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(1);
//        list2.add(3);
//        list2.add(22);
//        list2.add(44);
//        list2.add(65);
//        list2.add(89);
//        list2.add(90);
//        list2.add(92);
//        System.out.println(list2);

        //without using stream extract even numbers
//

        //Using stream
        Stream<Integer> stream = list1.stream();
        List<Integer> newList = stream.filter( i -> i%2 == 0 ).collect(Collectors.toList());
        System.out.println(newList);

        //filter numbers greater than 50

        List<Integer> newList2 =list1.stream().filter(i -> i > 50).collect(Collectors.toList());
        System.out.println(newList2);

    }
}
