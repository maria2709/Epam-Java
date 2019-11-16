package com.company;

/**
 * Created by Maryia_Gaydayenko on 10/31/2019.
 */
public class Book {
    private static int numOfBooks = 0;
    private int ID;
    private String title;
    private String author;
    private String publisher;
    private int numOfPages;
    private int year;
    private double price;

    public void setID(int ID) {this.ID = ID;}

    public void setTitle(String title) {this.title = title;}

    public void setAuthor(String author) {this.author = author;}

    public void setPublisher(String publisher) {this.publisher = publisher;}

    public void setNumOfPages(int numOfPages) {this.numOfPages = numOfPages;}

    public void setPrice(double price) {this.price = price;}

    public int getID() {return ID;}

    public int getYear() {return year;}

    public void setYear(int year) {this.year = year;}

    public String getTitle() {return title;}

    public String getAuthor() {return author;}

    public String getPublisher() {return publisher;}

    public int getNumOfPages() {return numOfPages;}

    public double getPrice() {return price;}

    public Book() {
        numOfBooks++;
        ID = numOfBooks;
    }

    public Book(String title, String author, String publisher, int year, int numOfPages, double price) {
      this();
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.numOfPages = numOfPages;
        this.price = price;

    }


    static public int getNumOfBooks() {return numOfBooks;}

    public void viewBook() {
        System.out.println("ID = " + ID+ ", Title = " + this.getTitle() + ", Author = " + this.getAuthor() + ", Publisher = "
                + this.getPublisher() + ", Year = " + this.getYear() + ", Number of pages = " + this.getNumOfPages()
                + ", Price = " + (double) Math.round(this.getPrice() * 100) / 100);

    }

}
