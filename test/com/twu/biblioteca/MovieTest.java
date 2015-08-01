package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void canGetTitleOfMovie() {
        Movie movie = new Movie("singham");

        assertEquals("singham", movie.getTitle());
    }
}
