package com.epam.less7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("The size of a shelf -> ");
        Scanner scan = new Scanner (System.in);
        int size = scan.nextInt();

        Books bookArray = new Books(size);
  //      Books[] bookSearch = new Books[];

        System.out.println("Add new book? 1 - yes, 2 - no");
        Scanner scan2 = new Scanner (System.in);
        int answer = scan.nextInt();

        if ((answer == 1) && (Book.getNumOfBooks() < size)) {
            do {
                bookArray.addBook(inputTitle(), inputAuthor(), inputPublish(), inputYear(), inputPages(), inputPrice());
                System.out.println("Add one more? 1 - yes, 2 - no");
                Scanner scan3 = new Scanner(System.in);
                answer = scan3.nextInt();

            } while ((answer == 1) && (Book.getNumOfBooks() < size));
        } else {
            System.out.println("Add items from internal resource? 1 - yes, 2 - no");
            Scanner scan3 = new Scanner(System.in);
            answer = scan3.nextInt();
            if (answer == 1) {
                bookArray.addBook("78 pigs", "Grimmade", "Publishing House", 2011, 447, 129.3);
                bookArray.addBook("Java for kids 2", "Fain", "Programming", 2019, 350, 25.78);
                bookArray.addBook("Java for kids", "Fain", "Programming", 2015, 350, 25.78);
                bookArray.addBook("78 pigs", "Grimmade", "Publishing House", 2011, 447, 100.0);
                bookArray.addBook("Java for kids 2", "Fain", "Programming", 2019, 350, 25.78);
            }
        }
            Books.printBooks(bookArray.getBookArray());

            System.out.println("To change price? 1 - yes, 2 - no");
            Scanner scan4 = new Scanner(System.in);
            answer = scan4.nextInt();
            if (answer == 1){
                System.out.println("Input % of growing the price and enter: ");
                Scanner scan5 = new Scanner(System.in);
                int percentPrice = scan5.nextInt();
                bookArray.changePrice(percentPrice);
            }

            Books.printBooks(bookArray.getBookArray());
        System.out.println("Find an author? 1 - yes, 2 - no");
        Scanner scan5 = new Scanner(System.in);
        answer = scan5.nextInt();
        if (answer == 1){
            System.out.println("Input the author: ");
            Scanner scan6 = new Scanner(System.in);
            String author = scan6.nextLine();
            Books.printBooks(Books.searchBook(bookArray.getBookArray() ,author) );
        }

        System.out.println("Find all the books published since a year? 1 - yes, 2 - no");
        Scanner scan6 = new Scanner(System.in);
        answer = scan6.nextInt();
        if (answer == 1){
            System.out.println("Input the year: ");
            Scanner scan7 = new Scanner(System.in);
            int year = scan7.nextInt();
            Books.printBooks(Books.searchBook(bookArray.getBookArray() ,year) );
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
