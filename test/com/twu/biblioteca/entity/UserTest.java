package com.twu.biblioteca.entity;

import com.twu.biblioteca.exception.IllegalFormationException;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class UserTest {
    @Test
    public void should_create_user_successfully_when_library_number_format_valid() throws IllegalFormationException {
        User user = new User("yao", "459780810@qq.com", "遵义", "18875039949", "1314159", "123-4567");

        assertNotNull(user);
    }

    @Test(expected = IllegalFormationException.class)
    public void should_throw_exception_when_library_number_format_invalid() throws IllegalFormationException {
        User user = new User("yao", "459780810@qq.com", "遵义", "18875039949", "1314159", "123*456788");
    }

}