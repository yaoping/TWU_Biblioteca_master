package com.twu.biblioteca.Storage;

import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.exception.IllegalFormationException;
import com.twu.biblioteca.exception.LibraryNumberUsedException;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UserStorageTest {
    private UserStorage userStorage;

    @Before
    public void setUp() throws Exception {
        userStorage = new UserStorage();
    }

    @Test
    public void should_add_successfully_when_the_library_number_unused() throws IllegalFormationException, LibraryNumberUsedException {
        User user = new User("yaoping", "459780811@qq.com", "遵义", "18875039949", "1314157", "123-5201");

        userStorage.addUser(user);

        assertThat(UserStorage.getUsers().get(1).getLibraryNumber(), is("123-5201"));
    }

    @Test(expected = LibraryNumberUsedException.class)
    public void should_throw_exception_when_the_library_number_used() throws IllegalFormationException, LibraryNumberUsedException {
        User user = new User("yaoping", "459780811@qq.com", "遵义", "18875039949", "1314157", "123-4567");

        userStorage.addUser(user);
    }

}