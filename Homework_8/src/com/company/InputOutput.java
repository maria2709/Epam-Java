package com.company;

import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;

public class InputOutput {

    static int actualSize = 20;

    public static int getActualSize(int actualSize) {

        return actualSize;
    }

    static String fileName = "C:\\MyJava\\Java-Epam\\Homework_7\\input-output-files\\input-output.txt";

    static String[] stringObject = new String[actualSize];
    static int[] idFromString = new int[actualSize];
    static String[] titleFromString = new String[actualSize];
    static String[] authorFromString = new String[actualSize];
    static String[] publisherFromString = new String[actualSize];
    static int[] yearFromString = new int[actualSize];
    static int[] pagesFromString = new int[actualSize];
    static double[] priceFromString = new double[actualSize];




  /* public static void writeInFile (Book[] array) throws IOException {
       BufferedWriter outputWriter = null;
       outputWriter = new BufferedWriter( new FileWriter(fileName));
       for (Book elem : array) {
           if (elem != null)
               outputWriter.write(elem.toString() + "\n");
       }
       outputWriter.flush();
       outputWriter.close();
   }*/

    public static void writeInFile(Book[] array) throws IOException {
        FileWriter outputWriter = new FileWriter(fileName);
        for (Book elem : array) {
            if (elem != null)
                outputWriter.write(elem.toString() + "\n");
        }
        outputWriter.close();

    }

    public static void readFromFile() throws IOException {

        FileReader inputReader = new FileReader(fileName);
        Scanner scan = new Scanner(inputReader);

        int i = 0;

        while (scan.hasNextLine()) {
            stringObject[i] = scan.nextLine();
           // System.out.println((i+1) + " : " + stringObject[i]);

            int indexOfId = stringObject[i].indexOf("ID = ");
            idFromString[i] = Integer.parseInt(String.valueOf(stringObject[i].charAt(indexOfId+5)));

            int indexOfTitle = stringObject[i].indexOf("Title = ");
            int indexOfTitleEnd = stringObject[i].indexOf(", A");
            titleFromString[i] = stringObject[i].substring((indexOfTitle+8), indexOfTitleEnd);

            int indexOfAuthor = stringObject[i].indexOf("Author = ");
            int indexOfAuthorEnd = stringObject[i].indexOf(", P");
            authorFromString[i] = stringObject[i].substring((indexOfAuthor+9), indexOfAuthorEnd);

            int indexOfPublisher = stringObject[i].indexOf("Publisher = ");
            int indexOfPublisherEnd = stringObject[i].indexOf(", Y");
            publisherFromString[i] = stringObject[i].substring((indexOfPublisher+12), indexOfPublisherEnd);

            int indexOfYear = stringObject[i].indexOf("Year = ");
            int indexOfYearEnd = stringObject[i].indexOf(", N");
            yearFromString[i] = Integer.parseInt(stringObject[i].substring((indexOfYear+7), indexOfYearEnd));

            int indexOfPages = stringObject[i].indexOf("Number of pages = ");
            int indexOfPagesEnd = stringObject[i].indexOf(", Price");
            pagesFromString[i] = Integer.parseInt(stringObject[i].substring((indexOfPages+18), indexOfPagesEnd));

            int indexOfPrice = stringObject[i].indexOf("Price = ");
            priceFromString[i] = Double.parseDouble(stringObject[i].substring((indexOfPrice+8), stringObject[i].length()-1));

            System.out.println("ID = " + idFromString[i]+ ", Title = "+titleFromString[i] + ", Author = " + authorFromString[i] +
                            ", Publisher = " + publisherFromString[i]+", Year = " + yearFromString[i] + ", Number of pages = "
                            + pagesFromString[i] + ", Price2333 = " + priceFromString[i]);
            i++;
        }

        actualSize=i;
        inputReader.close();



    }


}


