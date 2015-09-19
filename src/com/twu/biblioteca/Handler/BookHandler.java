package com.twu.biblioteca.Handler;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.Storage.Library;

import java.util.Iterator;

public class BookHandler {
    public static void showAllBooksInformation() {
        System.out.println("the library books information");
        Iterator<String> keySetIterator = getStringIterator();
        while (keySetIterator.hasNext()) {
            String key = keySetIterator.next();
            System.out.println("bookName:" + Library.getBookMap().get(key).getName() + "  " + "bookAuthor:" + Library.getBookMap().get(key).getAuthor());
        }
    }

    public Book checkoutBook(String bookId) {
        if (!isBookLoaded(bookId)) {
            System.out.println("Thank you! Enjoy the book");
            Library.getBookMap().get(bookId).setIsLoaded(true);
            return Library.getBookMap().get(bookId);
        } else {
            System.out.println("That book is not available.");
            return null;
        }
    }

    private boolean isBookLoaded(String bookId) {
        return Library.getBookMap().get(bookId).isLoaded();
    }

    public String returnBook(String bookId) {
        Iterator<String> keySetIterator = getStringIterator();
        while (keySetIterator.hasNext()) {
            String key = keySetIterator.next();
            if (bookId.equals(key)) {
                Library.getBookMap().get(bookId).setIsLoaded(false);
                System.out.println("Thank you for returning the Book");
                return "Thank you for returning the Book";
            }
        }
        return "That is not a valid book to return";
    }

    private static Iterator<String> getStringIterator() {
        return Library.getBookMap().keySet().iterator();
    }

}
