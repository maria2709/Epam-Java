package com.epam.less2;

public class Main {

    public static void main(String[] args) {
        //2.4

        double depos = 10000.5;
        int periodMonths = 6;
        int percent = 15;
        double benefYear = depos*percent/100;
        System.out.println("Benefit over the " + periodMonths + " months => " +  (double) Math.round(benefYear/12*periodMonths * 100) / 100);
    }
}
