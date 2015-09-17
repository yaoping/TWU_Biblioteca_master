package com.twu.biblioteca;


import org.junit.Test;

import java.util.Calendar;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;

public class LibraryTest {
    @Test
    public void should_add_books_when_the_bookId_is_not_exist() {

        Library.addBook("4", new Book("clean code", "Martin Fowler", Calendar.getInstance()));

        assertNotNull(Library.getBookMap().containsKey(4));
    }

    @Test
    public void should_not_add_books_when_the_bookId_exist() {
        Book book = new Book("clean code", "Martin Fowler", Calendar.getInstance());

        assertNull(Library.addBook("4", book));
    }


}