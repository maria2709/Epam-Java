package com.company;

import java.util.Calendar;

public class Validator {
    static int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    public static void validYear(int newYear) {
        if (newYear < 1548 || newYear > currentYear) {
            throw new InvalidYearException("Invalid year");
        } else return;
    }

    public static void validAuthor(String findAuthor)  {
        if (findAuthor.isEmpty()){
            throw new InvalidAuthorException("Invalid author");
        }

    }
    public static void validPercent(int percent) {
        if (percent <= 0) {
            throw new RuntimeException("Number less than 0");
        }
    }
}