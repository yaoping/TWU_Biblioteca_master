package com.twu.biblioteca.Handler;

import com.twu.biblioteca.entity.Book;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by ppyao on 9/19/15.
 */
public class BookHandlerTest {
    private BookHandler bookHandler;

    @Before
    public void setUp() throws Exception {
        bookHandler = new BookHandler();
    }

    @Test
    public void should_checkout_book_when_the_book_not_checkout() {
        Book book = bookHandler.checkoutBook("1");

        assertThat(book.getName(), is("refactor"));

        assertTrue(book.isLoaded());
    }

    @Test(expected = NullPointerException.class)
    public void should_throw_exception_book_when_the_bookId_is_not_exist() {
        Book book = bookHandler.checkoutBook("5");
    }

    @Test
    public void should_return_book_successfully() {
        Book book = bookHandler.checkoutBook("2");

        String message = bookHandler.returnBook(book.getBookId());

        assertThat(message, is("Thank you for returning the Book"));
    }

    @Test
    public void should_return_book_fail_when_the_bookId_do_not_belong_the_library() {
        String message = bookHandler.returnBook("4");

        assertThat(message, is("That is not a valid book to return"));
    }

}