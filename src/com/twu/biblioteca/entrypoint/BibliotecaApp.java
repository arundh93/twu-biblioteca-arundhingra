package com.twu.biblioteca.entrypoint;

import com.twu.biblioteca.Login;
import com.twu.biblioteca.User;
import com.twu.biblioteca.view.View;
import com.twu.biblioteca.libraryitem.Book;
import com.twu.biblioteca.libraryitem.LibraryItem;
import com.twu.biblioteca.libraryitem.Movie;
import com.twu.biblioteca.model.BibliotecaController;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.parser.Parser;

import java.util.ArrayList;


public class BibliotecaApp {
    public static void main(String[] args) {
        User user1 = new User("arun", "zxc.com", "123456789", "111", "111-1111", "admin");
        User user2 = new User("akash", "qwe.com", "125677897", "321", "765-4321", "user");
        User user3 = new User("abih", "qwes.com", "129877897", "222", "222-2222", "user");

        ArrayList<User> userList = new ArrayList<User>();
        userList.add(user2);
        userList.add(user1);
        userList.add(user3);
        Login login = new Login(userList);
        View view = new View();
        Book book1 = new Book("only time will tell", "Jeffery Archer", 2011);
        Book book2 = new Book("sins of a father", "Jeffery Archer", 2009);
        Book book3 = new Book("prodigal daughter", "Jeffery Archer", 2005);
        ArrayList<LibraryItem> availableBookList = new ArrayList<LibraryItem>();
        availableBookList.add(book1);
        availableBookList.add(book2);
        availableBookList.add(book3);
        Movie movie1 = new Movie("singham", "rohit shetty", 2011, 4);
        Movie movie2 = new Movie("singham2", "rohit shetty", 2014, 3);
        Movie movie3 = new Movie("krrish", "rakesh roshan", 2006, 4);
        ArrayList<LibraryItem>  availableMovieList = new ArrayList<LibraryItem>();
        ArrayList<LibraryItem> bookCheckOutList = new ArrayList<LibraryItem>();
        availableMovieList.add(movie1);
        availableMovieList.add(movie2);
        availableMovieList.add(movie3);
        ArrayList<String> bookOwnership = new ArrayList<String>();
        ArrayList<String> movieOwnership = new ArrayList<String>();
        ArrayList<LibraryItem> movieCheckOutList = new ArrayList<LibraryItem>();
        Library bookLibrary = new Library(availableBookList, bookCheckOutList, bookOwnership);
        Library movieLibrary = new Library(availableMovieList, movieCheckOutList, movieOwnership);
        Parser parser = new Parser(bookLibrary, movieLibrary, login);
        BibliotecaController application = new BibliotecaController(view, bookLibrary, movieLibrary, parser, login);
        application.start(true);
    }
}
