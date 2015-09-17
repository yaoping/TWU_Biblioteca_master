package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BibliotecaAppTest {
    @Test
    public void should_show_welcome_message() {
        assertThat(BibliotecaApp.sendWelcomeMessage(), is("Welcome"));
    }
}