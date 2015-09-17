package com.twu.biblioteca;

import java.util.Iterator;

public class Librarian {
    public static void showAllBooksInformation() {
        System.out.println("Show the library books information");
        Iterator<String> keySetIterator = Library.getBookMap().keySet().iterator();
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
        String message=null;
        Iterator<String> keySetIterator = Library.getBookMap().keySet().iterator();
        while (keySetIterator.hasNext()) {
            String key = keySetIterator.next();
            if (bookId.equals(key)) {
                Library.getBookMap().get(bookId).setIsLoaded(false);
                System.out.println( "Thank you for returning the Book");
                return "Thank you for returning the Book";
            }
        }
        return "That is not a valid book to return";
    }


}
