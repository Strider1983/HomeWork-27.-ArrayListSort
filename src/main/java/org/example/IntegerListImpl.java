package org.example;

import org.example.exeptions.CellIsNotEmptyExeption;
import org.example.exeptions.NumberNotFoundExeption;

import java.util.Arrays;

public class IntegerListImpl implements IntegerList{

    Integer[] numbers = new Integer[5];
    private static void swapElements(Integer[] arr, int indexA, int indexB) {
        int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }

    @Override
    public void sortSelection() {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            swapElements(numbers, i, minElementIndex);
        }
    }

    @Override
    public Integer add(Integer number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == null) {
                numbers[i] = number;
                break;
            }
        }
        return number;
    }

    @Override
    public Integer addToSpecCell(int index, Integer number) {
        if (numbers[index] == null) {
            numbers[index] = number;
        } else {
            throw new CellIsNotEmptyExeption("данная ячейка массива уже занята");
        }
        return number;
    }

    @Override
    public Integer set(int index, Integer number) {
        numbers[index] = number;
        return number;
    }

    @Override
    public Integer remove(Integer number) {
        boolean checkItem = false;
        for (Integer element:numbers) {
            if (element == number) {
                checkItem = true;
                break;
            }
        }
        if (checkItem == false) {
            throw new NumberNotFoundExeption("указанный элемент массива не найден");
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == number) {
                    numbers[i] = null;
                }
            }
            return number;
        }
    }

    @Override
    public Integer removeByIndex(int index) {
        if (numbers[index] == null) {
            throw new NumberNotFoundExeption("элемент с указанным индексом отсуствует в массиве");
        } else {
            numbers[index] = null;
        }
        return numbers[index];
    }

    @Override
    public boolean contains(Integer number) {
        boolean contains = false;
        for (Integer element:numbers) {
            if (element == number) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    @Override
    public int indexOf(Integer number) {
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(Integer number) {
        int index = -1;
        for (int i = numbers.length-1; i >= 0; i--) {
            if (numbers[i] == number) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public boolean equals(Integer[] otherList) {
        return Arrays.equals(numbers, otherList);
    }

    @Override
    public int size() {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != null) {
                count = count + 1;
            }
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = true;
        for (Integer element:numbers) {
            if (element != null) {
                isEmpty = false;
            }
        }
        return isEmpty;
    }

    @Override
    public void clear() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != null) {
                numbers[i] = null;
            }
        }
    }

    @Override
    public Integer[] toArray() {
        Integer[] newNumbers = Arrays.copyOf(numbers, numbers.length);
        return newNumbers;
    }

    @Override
    public boolean containsBin(Integer element) {
        sortSelection();

        int min = 0;
        int max = numbers.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (element == numbers[mid]) {
                return true;
            }

            if (element < numbers[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }
}
