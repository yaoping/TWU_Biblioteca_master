package com.twu.biblioteca.entity;

import com.twu.biblioteca.exception.RateOutRangeException;
import org.junit.Test;

import java.util.Calendar;

import static junit.framework.TestCase.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MoiveTest {

    @Test
    public void should_crete_movie_when_the_rate_valid() throws RateOutRangeException {
        Movie movie1 = new Movie("The First Blood", "director1", Calendar.getInstance(), 1);

        Movie movie2 = new Movie("The First Blood", "director1", Calendar.getInstance());

        assertNotNull(movie1);

        assertThat(movie2.getRate(), is(0));
    }

    @Test(expected = RateOutRangeException.class)
    public void should_throw_exception_when_the_rate_invalid() throws RateOutRangeException {
        Movie movie1 = new Movie("The First Blood", "director1", Calendar.getInstance(), 10);
    }


}