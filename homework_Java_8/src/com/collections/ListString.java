package com.collections;

import java.util.*;

public class ListString {
    private int size;
    private List<String> listStr = new ArrayList<>();

    public void addElements(int number, int size){
        Random random = new Random();

        this.size = size;

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        for (int i = 0; i < size; i++) {
            listStr.add(random.ints(leftLimit, rightLimit + 1)
                    .limit(size)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString());
        }
    }

   /* public void sortList(){
        Collections.sort(listStr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });
    }*/


    public void sortList(){
        Collections.sort(listStr, (s1, s2) -> s2.compareTo(s1) );
    }

    public void printString(){
        for (String c: listStr
        ) {
            System.out.print(c + " ");

        }
    }
}
