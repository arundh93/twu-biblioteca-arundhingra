package com.twu.biblioteca;

import java.util.ArrayList;


public class BibliotecaApp {
    public static void main(String[] args) {
        View view = new View();
        Book book1 = new Book("only time will tell", "Jeffery Archer", 2011);
        Book book2 = new Book("sins of a father", "Jeffery Archer", 2009);
        Book book3 = new Book("prodigal daughter", "Jeffery Archer", 2005);
        ArrayList<Book> availableList = new ArrayList<Book>();
        availableList.add(book1);
        availableList.add(book2);
        availableList.add(book3);
        ArrayList<Book> checkOutList = new ArrayList<Book>();
        Library library = new Library(availableList, checkOutList);
        Parser parser = new Parser();
        BibliotecaController application = new BibliotecaController(view, library, parser);
        application.start(true);
    }
}
