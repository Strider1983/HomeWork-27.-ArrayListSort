package org.example;

public interface IntegerList {
    Integer add(Integer number);
    Integer addToSpecCell(int index, Integer number);
    Integer set(int index, Integer number);
    Integer remove(Integer number);
    Integer removeByIndex(int index);
    boolean contains(Integer number);
    int indexOf(Integer number);
    int lastIndexOf(Integer number);
    boolean equals(Integer[] otherList);
    int size();
    boolean isEmpty();
    void clear();
    Integer[] toArray();
    void sortSelection();
    boolean containsBin(Integer element);

}
