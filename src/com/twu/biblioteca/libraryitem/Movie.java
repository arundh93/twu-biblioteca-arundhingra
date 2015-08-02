package com.twu.biblioteca.libraryitem;

public class Movie implements LibraryItem {
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

    @Override
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        return !(movieName != null ? !movieName.equals(movie.movieName) : movie.movieName != null);

    }

    @Override
    public int hashCode() {
        int result = movieName != null ? movieName.hashCode() : 0;
        result = 31 * result + (director != null ? director.hashCode() : 0);
        result = 31 * result + yearOfRelease;
        result = 31 * result + rating;
        return result;
    }


    @Override
    public boolean hasTitle(LibraryItem name) {
        return this.equals(name);
    }

    @Override
    public String toString() {
        return String.format("%-25s %-25s %-25s", getTitle(), getDirector(), Integer.toString(getYearOfRelease()), Integer.toString(getRating()));
    }
}
