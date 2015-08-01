package com.twu.biblioteca;

public class Movie {
    private String movieName;
    private String director;
    private int yearOfRelease;

    public Movie(String movieName, String director, int yearOfRelease) {
        this.movieName = movieName;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
    }

    public String getTitle() {
        return movieName;
    }

    public String getDirector() {
        return director;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }
}
