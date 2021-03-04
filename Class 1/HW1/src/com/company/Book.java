package com.company;

public class Book implements Comparable<Book>{
    private int accountID;
    private String bookName;
    private String author;
    private double price;


    public String toString(){
        return accountID+"\t"+bookName+"\t"+author+"\t"+"\t"+price;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    Book(int bAccountID, String bBookName, String bAuthor, double bPrice) {
        accountID = bAccountID;
        bookName = bBookName;
        author = bAuthor;
        price = bPrice;
    }
    public void setAccountID(int accountID){
         this.accountID = accountID;
    }
    public int getAccountID(){
         return accountID;
    }

    @Override
    public int compareTo(Book o) {
        return 0;
    }
}
