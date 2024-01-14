package org.example;

import java.util.Arrays;

public class Sort {
    public static Integer[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        Integer[] arr = new Integer[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    private static void swapElements(Integer[] arr, int indexA, int indexB) {
        int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }
    public static void sortBubble(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapElements(arr, j, j + 1);
                }
            }
        }
    }
    public static void sortSelection(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            swapElements(arr, i, minElementIndex);
        }
    }
    public static void sortInsertion(Integer[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }


    public static void main(String[] args) {
        //System.out.println("Sort");
        Integer[] nums = generateRandomArray();
        Integer[] nums2 = Arrays.copyOf(nums, nums.length);
        Integer[] nums3 = Arrays.copyOf(nums, nums.length);

        //long start = System.currentTimeMillis();
        //sortBubble(nums);
        //System.out.println(System.currentTimeMillis() - start);

        //long start2 = System.currentTimeMillis();
        //sortSelection(nums2);
        //System.out.println(System.currentTimeMillis() - start2);

        //long start3 = System.currentTimeMillis();
        //sortInsertion(nums3);
        //System.out.println(System.currentTimeMillis() - start3);
    }
}

