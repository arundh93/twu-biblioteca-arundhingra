package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MovieTest {

    @Test
    public void canGetTitleOfMovie() {
        Movie movie = new Movie("singham", "roy", 2009);

        assertEquals("singham", movie.getTitle());
    }

    @Test
    public void canGetDirectorOfMovie() {
        Movie movie = new Movie("singham", "roy", 2009);

        assertEquals("roy", movie.getDirector());
    }

    @Test
    public void canGetYearOfRealeaseOfMovie() {
        Movie movie = new Movie("singham", "roy", 2009);

        assertEquals(2009, movie.getYearOfRelease());

    }
}
