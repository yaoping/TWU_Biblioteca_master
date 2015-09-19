package com.twu.biblioteca.entity;

import com.twu.biblioteca.exception.RateOutRangeException;

import java.util.Calendar;

public class Movie {
    private String name;
    private Calendar year;
    private String director;
    private int rate;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Calendar getYear() {
        return year;
    }

    public void setYear(Calendar year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Movie(String name, String director, Calendar year) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.rate = 0;
    }

    public Movie(String name, String director, Calendar year, int rate) throws RateOutRangeException {
        this.name = name;
        this.director = director;
        this.year = year;
        if (isRateValid(rate)) {
            this.rate = rate;
        } else {
            throw new RateOutRangeException("the rate is invalid");

        }
    }

    private boolean isRateValid(int rate) {
        return (rate <= 9 && rate >= 0) ? true : false;
    }
}
