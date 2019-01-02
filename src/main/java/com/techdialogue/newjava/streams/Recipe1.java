package com.techdialogue.newjava.streams;

import com.techdialogue.newjava.Utility;

import java.util.stream.IntStream;

public class Recipe1 {

    public static void main(String[] args) {

        //Iteration equivalent to for loop
        IntStream.range(1,5)
                .forEach(System.out::println);
        Utility.printLine();

        IntStream.rangeClosed(1,5)
                .forEach(System.out::println);
    }
}
