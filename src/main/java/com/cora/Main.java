package com.cora;

public class Main {
    public static void main(String[] args) {

        // Now that we created a Constructor mehod, we can pass the book attributes directly in as arguments
        Book book = new Book("My best chess game", "Bobby Fischer", "non-fiction", 266); // "new Book()" is a Constructor method built into Classes
//        book.title = "My best chess game";
//        book.author = "Bobby Fischer";
//        book.genre = "non-fiction";
//        book.pages = 266;

        Book book2 = new Book("My second book", "Jane Doe", "fiction", 138);
//        book2.title = "My second book";
//        book2.author = "Jane Doe";
//        book2.genre = "fiction";
//        book2.pages = 138;

        printBook(book);
        printBook(book2);

        System.out.println("main running...");

        // Car Exercise:

        Car car = new Car();
        car.startCar();
        car.accelerateCar(10);

        // Person Exercise:
        Person person = new Person("John Doe", 27, 'M', true );
        person.introduce();
    }

    public static void printBook(Book book) {
        System.out.println("Title: " + book.title + "Author: " + book.author + "Genre: " + book.genre + "Pages: " + book.pages);
    }
}