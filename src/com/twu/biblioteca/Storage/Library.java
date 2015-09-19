package com.twu.biblioteca.Storage;

import com.twu.biblioteca.entity.Book;

import java.util.*;

public class Library {
    private static Map<String, Book> bookMap = new HashMap<String, Book>();

    static {
        Library.addBook("1", new Book("refactor", "Martin Fowler", Calendar.getInstance()));
        Library.addBook("2", new Book("TDD", "Kent Beck", Calendar.getInstance()));
        Library.addBook("3", new Book("Thinking in java", "Bruce Eckel", Calendar.getInstance()));
    }

    public static Map<String, Book> getBookMap() {
        return bookMap;
    }

    public static Book addBook(String bookId, Book book) {
        if (!isNotAddBook(bookId)) {
            book.setBookId(bookId);
            return bookMap.put(bookId, book);
        } else {
            return null;
        }
    }

    private static boolean isNotAddBook(String bookId) {
        return bookMap.containsKey(bookId) ? true : false;
    }
}
