package com.twu.biblioteca.Storage;

import com.twu.biblioteca.entity.Movie;
import com.twu.biblioteca.exception.RateOutRangeException;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MovieLibrary {
    private static List<Movie> movies = new ArrayList<Movie>();

    static {
        try {
            movies.add(new Movie("Roman Holiday", "director1", Calendar.getInstance(), 5));
            movies.add(new Movie("The First Blood", "director1", Calendar.getInstance(), 6));
        } catch (RateOutRangeException e) {
            e.printStackTrace();
        }
    }

    public static List<Movie> getMovies() {
        return movies;
    }

    public static void setMovies(List<Movie> movies) {
        MovieLibrary.movies = movies;
    }
}
