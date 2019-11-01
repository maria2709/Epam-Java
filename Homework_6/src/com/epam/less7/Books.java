package com.epam.less7;


import java.util.Arrays;
import java.util.Scanner;

public class Books {
    public Book[] bookArray;
  //  public Book[] bookSearch;
    private int size;

    public int getSize() {
        return size;
    }

    public Book[] getBookArray() {
        return bookArray;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Books(int size) {
       this.size = size;
        //Book[] shelf = new Book[getSize()];
        this.bookArray  = new Book[getSize()];

    }

    void addBook(String title, String author, String publisher, int year, int numOfPages, double price) {
        int i = Book.getNumOfBooks();
        if (i < this.size) {
            bookArray[i] = new Book(title, author, publisher, year, numOfPages, price);
        }
    }

    static void printBooks(Book[] shelf) {
        if (shelf.length == 0){
            System.out.println("No!");
        }
        else {
            for (Book elem : shelf){
                if (elem != null)
                    elem.viewBook();
            }
        }
    }

    public void changePrice(int percent) {
              for (int i = 0; i < Book.getNumOfBooks(); i++) {
              if (bookArray[i] != null) {
                  bookArray[i].setPrice((bookArray[i].getPrice())*(1+percent/100.0));
               }

        }
    }

   /* static Animals[] searchAnimal (Animals[] animals, String name){
        Animals [] res = new Animals[animals.length];
        int counter = 0;
        for (Animals an: animals){
            if (an.getName().equals(name)){
                res[counter++] = an;
            }

        }
        return Arrays.copyOf(res, counter);
    }*/

   static Book[] searchBook (Book[] shelf, String name){
       Book [] res = new Book [Book.getNumOfBooks()];
       int counter = 0;
       for (Book an: shelf){
           if ((an != null) &&(an.getAuthor().equalsIgnoreCase(name))){
               res[counter++] = an;
           }
       }
        return Arrays.copyOf(res, counter);
    }

    static Book[] searchBook (Book[] shelf, int year){
        Book [] res = new Book [Book.getNumOfBooks()];
        int counter = 0;
        for (Book an: shelf){
            if ((an != null) &&(an.getYear() >=year)){
                res[counter++] = an;
            }
        }
        return Arrays.copyOf(res, counter);
    }
    }




