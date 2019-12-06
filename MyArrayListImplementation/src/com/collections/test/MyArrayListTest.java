package com.collections.test;

import com.collections.MyArrayList;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {
    //creating test data for testing methods getSize, add, remove contains, clear
    int[] array = {9,2,5,6,4,88,123, 78, 33, 2, 4, 55, -78, -8};
    MyArrayList newArray = new MyArrayList(array);

    @Test
    public void getSize() {
        int expectedSize = array.length;
        assertEquals(expectedSize, newArray.getSize());

    }

    @Test
    public void add() {
        int oldSize = newArray.getSize();
        int newElement = 100;
        newArray.add(newElement);
        assertEquals(oldSize + 1, newArray.getSize() );
        assertEquals(newElement, newArray.getElement(newArray.getSize()-1));
    }

    @Test
    public void remove() {
        int index = 5;
        int oldSize = newArray.getSize();
        int nextElement = newArray.getElement(index+1);
        newArray.remove(index);
        assertEquals(oldSize -1, newArray.getSize());
        assertEquals(nextElement, newArray.getElement(index));
    }

    @Test
    public void contains() {
        int elementTrue = -8;
        int elementFalse = 7801;
        assertEquals(true, newArray.contains(elementTrue));
        assertEquals(false, newArray.contains(elementFalse));
    }

    @Test
    public void clear() {
        newArray.clear();
        for (int i = 0; i < newArray.getSize(); i++){
            assertEquals(newArray.getElement(i), 0);
        }
        assertEquals(0, newArray.getSize());
    }

    @Test
    public void toArray() {
        int[] array = {9,2,5,6,4,88,123, 78, 33, 2, 4, 55, -78, -8};
        MyArrayList newArray = new MyArrayList(array);
        int[] simpleArray = newArray.toArray();
        assertArrayEquals(array, simpleArray);
    }
}