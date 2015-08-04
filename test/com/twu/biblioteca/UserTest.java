package com.twu.biblioteca;

import com.twu.biblioteca.libraryitem.LibraryItem;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canReturnItsInformation() {
        ArrayList<LibraryItem> books = new ArrayList<LibraryItem>();
        ArrayList<LibraryItem> movies = new ArrayList<LibraryItem>();
        User user = new User("arun", "arun@xyz.com", "123456789", books, movies, "123", "123-4567");

        assertEquals("arun                      arun@xyz.com              123456789                ", user.toString());
    }

    @Test
    public void canReturnIssuedBooks() {
        ArrayList<LibraryItem> books = new ArrayList<LibraryItem>();
        ArrayList<LibraryItem> movies = new ArrayList<LibraryItem>();
        User user = new User("arun", "arun@xyz.com", "123456789", books, movies, "123", "123-4567");

        assertEquals(new ArrayList<LibraryItem>(), user.getIssuedBooks());
    }

    @Test
    public void canReturnIssuedMovies() {
        ArrayList<LibraryItem> books = new ArrayList<LibraryItem>();
        ArrayList<LibraryItem> movies = new ArrayList<LibraryItem>();
        User user = new User("arun", "arun@xyz.com", "123456789", books, movies, "123", "123-4567");

        assertEquals(new ArrayList<LibraryItem>(), user.getIssuedMovies());
    }

    @Test
    public void canBeVerifiedAsARegisteredUser() {
        ArrayList<LibraryItem> books = new ArrayList<LibraryItem>();
        ArrayList<LibraryItem> movies = new ArrayList<LibraryItem>();
        User user1 = new User("arun", "arun@xyz.com", "123456789", books, movies, "123", "123-4567");

        User user2 = new User("arun", "arun@xyz.com", "123456789", books, movies, "123", "123-4567");

        assertEquals(user2, user1);
    }
}
