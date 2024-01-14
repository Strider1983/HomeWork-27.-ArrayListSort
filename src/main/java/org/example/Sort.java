package org.example;

public class Sort {
    public static void main(String[] args) {
        System.out.println("Sort");
        IntegerList integerList = new IntegerListImpl();
        Integer[] nums1 = integerList.generateRandomArray();
        long start = System.currentTimeMillis();
        integerList.sortBubble(nums1);
        System.out.println(System.currentTimeMillis() - start);
        Integer[] nums2 = integerList.generateRandomArray();
        long start2 = System.currentTimeMillis();
        integerList.sortSelection(nums2);
        System.out.println(System.currentTimeMillis() - start2);
        Integer[] nums3 = integerList.generateRandomArray();
        long start3 = System.currentTimeMillis();
        integerList.sortInsertion(nums3);
        System.out.println(System.currentTimeMillis() - start3);

    }
}
