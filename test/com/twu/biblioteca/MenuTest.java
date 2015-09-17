package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class MenuTest {
    @Test
    public void should_show_the_menu_option() {
        StringBuffer menuContent = new StringBuffer();

        menuContent.append("1 ---listBooks");

        Menu.showMenuOption();
    }

    @Test
    public void should_get_valid_option() {

        assertTrue(Menu.isValidOption(1));

        assertTrue(Menu.isValidOption(0));
    }

    @Test
    public void should_get_invalid_option() {
        assertFalse(Menu.isValidOption(2));

        assertFalse(Menu.isValidOption(3));

        assertFalse(Menu.isValidOption(4));

        assertFalse(Menu.isValidOption(5));

        assertFalse(Menu.isValidOption(6));

        assertFalse(Menu.isValidOption(7));

        assertFalse(Menu.isValidOption(8));

        assertFalse(Menu.isValidOption(9));

    }

    @Test
    public void should_handle_the_option() {
        Menu.handleOption(1);
    }
}