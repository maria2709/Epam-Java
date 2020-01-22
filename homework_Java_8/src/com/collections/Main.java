package com.collections;
import java.util.stream.*;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        IntegerArray myArray = new IntegerArray();
        myArray.addElements(15);
        System.out.println("\nInitial array: ");
        myArray.printArray();
        myArray.sortArray();
        System.out.println("\nSorted array: ");
        myArray.printArray();

        ListString myString  = new ListString();
        myString.addElements(10,8);
        System.out.println("\n\nInitial list of random strings: ");
        myString.printString();
        myString.sortList();
        System.out.println("\n\nSorted list of random strings: ");
        myString.printString();


        System.out.println("\n\nNegative values of array: ");
        myArray.select(myArray, "negative");
        System.out.println("\n\nPositive values of array: ");
        myArray.select(myArray, "positive");




    }
}
