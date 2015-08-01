package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MovieTest {

    @Test
    public void canGetTitleOfMovie() {
        Movie movie = new Movie("singham", "roy");

        assertEquals("singham", movie.getTitle());
    }

    @Test
    public void canGetAuthorOfBook() {
        Movie movie = new Movie("singham", "roy");

        assertEquals("roy", movie.getDirector());
    }
}
