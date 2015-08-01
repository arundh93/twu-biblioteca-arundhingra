package com.twu.biblioteca;

public class Movie {
    private String movieName;
    private String director;

    public Movie(String movieName, String director) {
        this.movieName = movieName;
        this.director = director;
    }

    public String getTitle() {
        return movieName;
    }

    public String getDirector() {
        return director;
    }
}
