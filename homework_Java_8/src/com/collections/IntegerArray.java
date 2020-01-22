package com.collections;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Collections.sort;

public class IntegerArray {
    private int size;
    private List<Integer> arrayInt = new ArrayList<>();

    public void addElements(int size){
        Random random = new Random();

        this.size = size;
        for (int i = 0; i < size; i++) {
            arrayInt.add(random.nextInt(150) - 50);
        }
    }

  /*  public void sortArray(){
        sort(arrayInt, new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }
        });
    }*/

    public void sortArray(){
          sort(arrayInt, (i2, i1) -> i2.compareTo(i1) );
     }

    public List<Integer> selectNegative(){
        List<Integer> arrayNegative = new ArrayList<>();
        for (Integer c: arrayInt) {
            if (c < 0)
            arrayNegative.add(c);
        }
        return arrayNegative;

     }

    public void negative() {
         arrayInt.stream().filter(num -> num < 0).forEach(System.out::println);
    }

    public void positive() {
        arrayInt.stream().filter(num -> num > 0).forEach(System.out::println);
    }


    public void printArray(){
        for (Integer c: arrayInt
             ) {
            System.out.print(c + " ");

        }
    }

    public void select(IntegerArray someArray, String method){
        if (method == "negative"){
            someArray.negative();
        }
        if (method == "positive"){
            someArray.positive();
        }


    }



}
