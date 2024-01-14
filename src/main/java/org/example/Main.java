package org.example;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        IntegerList integerList = new IntegerListImpl();
        integerList.add(2);
        integerList.add(13);
        integerList.add(8);
        integerList.add(27);
        integerList.add(45);
        boolean cont = integerList.containsBin(48);
        System.out.println(cont);


    }
}