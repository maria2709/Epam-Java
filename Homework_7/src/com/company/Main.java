package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InvalidYearException {
        System.out.println("The size of a shelf -> ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        Books bookArray = new Books(size);

        System.out.println("Add items from internal resource? 1 - yes, 2 - no");

        int answer = scan.nextInt();
        if (answer == 1) {

            bookArray.addBooks(new Book("78 pigs", "Grimmade", "Publishing House", 2011, 447, 129.3));
            bookArray.addBooks(new Book("Java for kids 2", "Fain", "Programming", 2019, 350, 25.78));
            bookArray.addBooks(new Book("Java for kids", "Fain", "Programming", 2015, 350, 25.78));
            bookArray.addBooks(new Book("78 pigs", "Grimmade", "Publishing House", 2011, 447, 100.0));
            bookArray.addBooks(new Book("Java for kids 2", "Fain", "Programming", 2019, 350, 25.78));
            bookArray.addBooks(new Book("Alice", "Carrol", "Publishing House", 2001, 247, 200.0));

        }

        Books.printBooks(bookArray.getBookArray());


        System.out.println("To change price? 1 - yes, 2 - no");
        Scanner scan4 = new Scanner(System.in);
        answer = scan4.nextInt();
        if (answer == 1) {
            boolean f = false;
            do {
                try {
                    System.out.println("Input % of growing the price and enter: ");
                    int percentPrice = scan.nextInt();
                    Validator.validPercent(percentPrice);
                    bookArray.changePrice(percentPrice);
                    f = true;
                }
                catch (RuntimeException e){
                    System.out.println("The percent cannot be less than 0.");
                }
            }

            while (f == false);
        }

        Books.printBooks(bookArray.getBookArray());
        System.out.println("Find an author? 1 - yes, 2 - no");
        Scanner scan1 = new Scanner(System.in);
        answer = scan1.nextInt();
        if (answer == 1) {
            boolean f = true;
            do {
               try {
                   System.out.println("Input the author: ");
                   Scanner scan2 = new Scanner(System.in);
                   String author = scan2.nextLine();
                   Validator.validAuthor(author);
                   Books.printBooks(Books.searchBook(bookArray.getBookArray(), author));
                   f = false;
               } catch (InvalidAuthorException e) {
                   System.out.println("Invalid name's input.");
               }
           } while (f == true);

        }

        System.out.println("Find all the books published since a year? 1 - yes, 2 - no");
        answer = scan.nextInt();
        if (answer == 1) {

            boolean f = true;
            do {
                System.out.println("Input the year: ");
                int year = scan.nextInt();
                try {
                    Validator.validYear(year);
                    Books.printBooks(Books.searchBook(bookArray.getBookArray(), year));
                    f = false;
                }
                catch (InvalidYearException myExc ){
                    System.out.println("Invalid year!");
                }


            } while (f == true);
        }
    }

    public static String inputTitle (){
        System.out.println("Enter a title of the book: ");
        Scanner scan_title = new Scanner(System.in);
        String bookTitle = scan_title.nextLine();
        return bookTitle;

    }

    public static String inputAuthor (){
        System.out.println("Enter an author of the book: ");
        Scanner scan = new Scanner(System.in);
        String bookAuthor = scan.nextLine();
        return bookAuthor;

    }

    public static String inputPublish () {
        System.out.println("Enter a publishing house: ");
        Scanner scan = new Scanner(System.in);
        String bookPublish = scan.nextLine();
        return bookPublish;
    }

    public static int inputYear(){
        System.out.println("Enter a year of publishing: ");
        Scanner scan = new Scanner(System.in);
        int bookYear = scan.nextInt();
        return bookYear;
    }

    static int inputPages(){
        System.out.println("Enter a number of pages: ");
        Scanner scan = new Scanner(System.in);
        int numOfPages = scan.nextInt();
        return numOfPages;
    }

    static double inputPrice(){
        System.out.println("Enter a price: ");
        Scanner scan = new Scanner(System.in);
        double numOfPages = scan.nextDouble();
        return numOfPages;
    }
}
