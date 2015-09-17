package com.twu.biblioteca;


import java.util.Calendar;

public class Book {
    private String name;
    private String author;
    private Calendar publishedDay;
    private boolean isLoaded;
    private String bookId;

    public Book(String name, String author, Calendar publishedDay) {
        this.name = name;
        this.author = author;
        this.publishedDay = publishedDay;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Calendar getPublishedDay() {
        return publishedDay;
    }

    public boolean isLoaded() {
        return isLoaded;
    }

    public void setIsLoaded(boolean isLoaded) {
        this.isLoaded = isLoaded;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}
