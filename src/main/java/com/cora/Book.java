package com.cora;

// This is the main Book Class
public class Book {

    // Define what attributes you want the Book to have
    String title;
    String author;
    String genre;
    int pages;

    // Create a Constructor method (notice there is no return)
    public Book(String title, String author, String genre, int pages) {

        // You can't just say: title = title;
        // since this could confuse the "title" variable that we defined (attribute),
        // or it could be the title being passed in as an argument to this Book constructor method
        this.title = title; // Have to use "this" keyword
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        }
}
