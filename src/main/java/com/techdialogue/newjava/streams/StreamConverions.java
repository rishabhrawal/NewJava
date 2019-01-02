package com.techdialogue.newjava.streams;

import com.techdialogue.newjava.Orange;
import com.techdialogue.newjava.Utility;

public class StreamConverions {
    public static void main(String[] args) {

        System.out.println("Let check the original Stream...");
        Utility.getOranges().stream().forEach(System.out::println);

        System.out.println("Stream converted to int...");
        Utility.printLine();
        Utility.getOranges().stream().mapToInt(Orange::getWeight).forEach(System.out::println);
    }
}
