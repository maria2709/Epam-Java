package com.epam.less2;

public class Main {

    public static void main(String[] args) {
        //2.3

        int weightPound = 100;
        double weightKg = weightPound * 0.4536;
        System.out.println("Weight in kg and gr => " + (int)weightKg + "kg " + (int)((weightKg - (int) weightKg)*1000) + "gr");

    }
}
