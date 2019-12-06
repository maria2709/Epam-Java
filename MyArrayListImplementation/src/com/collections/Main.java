package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] array = {9,88,123, 78, 33, 2, 4, -78, -8};

        MyArrayList newArray = new MyArrayList(array);
        for (int i = 0; i < newArray.getSize(); i++)
            System.out.print(newArray.getElement(i) + " ");
        System.out.println();
        System.out.println(newArray.getSize());
        System.out.println(newArray.getCapacity());

        newArray.add(100000);
        System.out.println(newArray.getSize());
        System.out.println(newArray.getCapacity());
        newArray.add(100000);
        newArray.add(100000);
        System.out.println(newArray.getSize());
        System.out.println(newArray.getCapacity());

        for (int i = 0; i < newArray.getSize(); i++)
            System.out.print(newArray.getElement(i) + " ");
       // System.out.println(newArray.getSize());
     //   System.out.println(newArray.getElement(newArray.getSize()-1));
        newArray.remove(5);

        System.out.println(newArray.getSize());

        for (int i = 0; i < newArray.getSize(); i++)
        System.out.print(newArray.getElement(i) + " ");
        System.out.println();

        newArray.remove(0);
        for (int i = 0; i < newArray.getSize(); i++)
            System.out.print(newArray.getElement(i) + " ");
        System.out.println();

        newArray.remove(0);
        for (int i = 0; i < newArray.getSize(); i++)
            System.out.print(newArray.getElement(i) + " ");

        System.out.println();
        newArray.output();

        System.out.println(newArray.contains(7800));
        System.out.println();

        newArray.clear();
        newArray.output();
        System.out.println("empty array size: " + newArray.getSize());

        newArray.add(788);
        newArray.output();
        System.out.println(newArray.getSize());
        System.out.println(newArray.getCapacity());
      //  MyArrayList[] copy1 = Arrays.copyOf(newArray, 10);

        int[] simpleArray = newArray.toArray();
        int[] copy = Arrays.copyOf(simpleArray, 5);
        System.out.println(copy.length);

        for (int i = 0; i < copy.length; i++)
            System.out.print(copy[i] + " ");


    }
}
