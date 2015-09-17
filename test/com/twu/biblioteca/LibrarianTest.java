package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LibrarianTest {
    private Librarian librarian;

    @Before
    public void setUp() throws Exception {
        librarian = new Librarian();
    }

    @Test
    public void should_checkout_book_when_the_book_not_checkout() {
        Book book = librarian.checkoutBook("1");

        assertThat(book.getName(), is("refactor"));

        assertTrue(book.isLoaded());
    }

    @Test(expected = NullPointerException.class)
    public void should_throw_exception_book_when_the_bookId_is_not_exist() {
        Book book = librarian.checkoutBook("5");
    }

    @Test
    public void should_return_book_successfully() {
        Book book = librarian.checkoutBook("2");

        String message = librarian.returnBook(book.getBookId());

        assertThat(message, is("Thank you for returning the Book"));
    }

    @Test
    public void should_return_book_fail_when_the_bookId_do_not_belong_the_library() {
        String message = librarian.returnBook("4");

        assertThat(message, is("That is not a valid book to return"));
    }

}