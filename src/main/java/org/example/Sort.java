package org.example;

public class Sort {
    public static void main(String[] args) {
        System.out.println("Sort");
        IntegerList integerList = new IntegerListImpl();
        integerList.generateRandomArray();
        long start = System.currentTimeMillis();
        integerList.sortBubble();
        System.out.println(System.currentTimeMillis() - start);
        integerList.generateRandomArray();
        long start2 = System.currentTimeMillis();
        integerList.sortSelection();
        System.out.println(System.currentTimeMillis() - start2);
        integerList.generateRandomArray();
        long start3 = System.currentTimeMillis();
        integerList.sortInsertion();
        System.out.println(System.currentTimeMillis() - start3);

    }
}
