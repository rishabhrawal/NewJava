package com.techdialogue.newjava.streams;

import com.techdialogue.newjava.Orange;
import com.techdialogue.newjava.Utility;

import java.util.Comparator;

public class Sorting {

    public static void main(String[] args) {
        Utility.getOranges()
                .stream()
                .sorted(Comparator.comparing((Orange::getWeight)))
                .forEach(System.out::println);

        Utility.printLine();
        Utility.getOranges()
                .stream()
                .sorted(Comparator.comparing((Orange::getWeight)).thenComparing(Orange::getPicked))
                .forEach(System.out::println);
    }
}
