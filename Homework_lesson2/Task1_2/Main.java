package com.epam.less2;

public class Main {

    public static void main(String[] args) {
        //2.2

        int number = 123;
        int numberInv;
        numberInv = (number % 10)*100 + (number % 100 - number % 10) + number / 100;
        System.out.println("Initial number = " + number);
        System.out.println("Inv number = " + numberInv);
        System.out.println("Difference = " + (number - numberInv));
    }
}
