package com.twu.biblioteca;

public class Movie {
    private String movieName;
    private String director;
    private int yearOfRelease;
    private int rating;

    public Movie(String movieName, String director, int yearOfRelease, int rating) {
        this.movieName = movieName;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
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

    public int getRating() {
        return rating;
    }
}
