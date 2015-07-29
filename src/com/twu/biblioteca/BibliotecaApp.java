package com.twu.biblioteca;

import java.util.ArrayList;


public class BibliotecaApp {
    public static void main(String[] args) {
        View view = new View();
        Book book1 = new Book("only time will tell", "Jeffery Archer", 2011);
        Book book2 = new Book("sins of a father", "Jeffery Archer", 2009);
        Book book3 = new Book("prodigal daughter", "Jeffery Archer", 2005);
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        BibliotecaController application = new BibliotecaController(view, books, new ArrayList<String>());
        application.start();
    }
}
