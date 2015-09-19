package com.twu.biblioteca.Handler;

import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.exception.IllegalFormationException;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class LoginHandlerTest {
    @Test
    public void should_login_successfully_when_library_number_and_password_match() throws IllegalFormationException {
        User user = new User("yao", "459780810@qq.com", "遵义", "18875039949", "1314159", "123-4567");

        boolean success = LoginHandler.isLoginSuccessfully(user.getLibraryNumber(), user.getPassword());

        assertTrue(success);
    }
}