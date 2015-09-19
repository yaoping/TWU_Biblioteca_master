package com.twu.biblioteca.entity;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class MenuTest {
    @Test
    public void should_show_the_menu_option() {
        StringBuffer menuContent = new StringBuffer();

        menuContent.append("1 ---listBooks");

        Menu.chooseOption();
    }

    @Test
    public void should_get_valid_option() {

        assertTrue(Menu.isValidOption(1));

        assertTrue(Menu.isValidOption(0));

        assertTrue(Menu.isValidOption(2));

        assertTrue(Menu.isValidOption(3));

        assertTrue(Menu.isValidOption(4));

        assertTrue(Menu.isValidOption(5));

        assertTrue(Menu.isValidOption(6));

        assertTrue(Menu.isValidOption(7));

        assertTrue(Menu.isValidOption(8));

        assertTrue(Menu.isValidOption(9));
    }

    @Test
    public void should_get_invalid_option() {
        assertFalse(Menu.isValidOption(10));
    }

    @Test
    public void should_handle_the_option() {
        Menu.handleOption(1);
    }
}