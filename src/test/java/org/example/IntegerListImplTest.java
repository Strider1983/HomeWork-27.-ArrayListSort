package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class IntegerListImplTest {
    private final IntegerListImpl integerList = new IntegerListImpl();
    @Test
    public void shouldItemBeAdded() {
        Integer[] nums = new Integer[] {5};
        Integer actualIt = integerList.add(5);
        Assertions.assertEquals(nums[0], actualIt);
    }
    @Test
    public void shouldItemBeAddedToSpecCell() {
        Integer[] nums = new Integer[] {5};
        Integer actualIt = integerList.addToSpecCell(0, 5);
        Assertions.assertEquals(nums[0], actualIt);
    }
    @Test
    public void shouldItemBeSet() {
        Integer[] nums = new Integer[] {5};
        Integer actualIt = integerList.set(0, 5);
        Assertions.assertEquals(nums[0], actualIt);
    }
    @Test
    public void shouldItemBeRemoved() {
        Integer[] nums = new Integer[] {5};
        integerList.add(5);
        Integer actualNumber = integerList.remove(5);
        Assertions.assertEquals(nums[0], actualNumber);
    }
    @Test
    public void shouldItemBeRemovedByIndex() {
        Integer[] nums = new Integer[5];
        integerList.add(5);
        Integer actualNumber = integerList.removeByIndex(0);
        Assertions.assertEquals(nums[0], actualNumber);
    }
    @Test
    public void shouldItemBeInArray() {
        Integer[] nums = new Integer[] {5};
        boolean it1 = true;
        integerList.add(5);
        boolean actualNumber = integerList.contains(5);
        Assertions.assertEquals(it1, actualNumber);
    }
    @Test
    public void shouldIndexBeReturned() {
        Integer[] nums = new Integer[] {5};
        int index = 0;
        integerList.add(5);
        int actualIndex = integerList.indexOf(5);
        Assertions.assertEquals(index, actualIndex);
    }
    @Test
    public void shouldLastIndexBeReturned() {
        int index = 0;
        integerList.add(5);
        int actualIndex = integerList.lastIndexOf(5);
        Assertions.assertEquals(index, actualIndex);
    }
    @Test
    public void shouldArraysBeCompared() {
        Integer[] nums = new Integer[5];
        nums[0] = 5;
        integerList.add(5);
        boolean compare = true;
        boolean actualCompare = integerList.equals(nums);
        Assertions.assertEquals(compare, actualCompare);
    }
    @Test
    public void shouldSizeBeReturned() {
        int size = 3;
        integerList.add(5);
        integerList.add(3);
        integerList.add(1);
        int actualSize = integerList.size();
        Assertions.assertEquals(size, actualSize);
    }
    @Test
    public void shouldArrayBeEmpty() {
        boolean isNotEmpty = false;
        integerList.add(5);
        boolean actualEmpty = integerList.isEmpty();
        Assertions.assertEquals(isNotEmpty, actualEmpty);
    }
    @Test
    public void shoulArrayBeCleared() {
        Integer[] nums = new Integer[5];
        boolean clear = true;
        integerList.add(5);
        integerList.clear();
        Integer[] cleared = integerList.toArray();
        boolean actualClear = Arrays.equals(cleared, nums);
        Assertions.assertEquals(actualClear, clear);

    }
    @Test
    public void shouldNewArrayBeCreated() {
        Integer[] nums = new Integer[5];
        nums[0] = 5;
        boolean created = true;
        integerList.add(5);
        Integer[] actualNumbers = integerList.toArray();
        boolean actual = Arrays.equals(nums, actualNumbers);
        Assertions.assertEquals(created, actual);

    }
    @Test
    public void checkContainsBin() {
        boolean contain = true;
        integerList.add(5);
        integerList.add(45);
        integerList.add(73);
        integerList.add(68);
        integerList.add(11);
        boolean actualContain = integerList.containsBin(73);
        Assertions.assertEquals(contain, actualContain);
    }
    @Test
    public void checkSortSelection() {
        boolean equal = true;
        Integer[] nums = new Integer[] {1, 2, 3, 4, 5};
        integerList.addToSpecCell(0, 2);
        integerList.addToSpecCell(1, 4);
        integerList.addToSpecCell(2, 3);
        integerList.addToSpecCell(3, 5);
        integerList.addToSpecCell(4, 1);
        integerList.sortSelection();
        Integer[] actualNumbers = integerList.toArray();
        boolean actualEqual = Arrays.equals(nums, actualNumbers);
        Assertions.assertEquals(equal, actualEqual);
    }

}
