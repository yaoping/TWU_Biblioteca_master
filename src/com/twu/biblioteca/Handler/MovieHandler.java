package com.twu.biblioteca.Handler;

import com.twu.biblioteca.Storage.MovieLibrary;
import com.twu.biblioteca.entity.Movie;

public class MovieHandler {

    public static void showAllMoviesInformation() {
        System.out.println("the movies' information");
        for (Movie movie : MovieLibrary.getMovies()) {
            System.out.println("movieName:" + movie.getName() + "   " + "Director" + movie.getDirector() + "  " + "Rate:" + movie.getRate());
        }
    }


}
