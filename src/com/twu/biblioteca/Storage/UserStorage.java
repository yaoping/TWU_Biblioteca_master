package com.twu.biblioteca.Storage;

import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.exception.IllegalFormationException;
import com.twu.biblioteca.exception.LibraryNumberUsedException;

import java.util.ArrayList;
import java.util.List;

public class UserStorage {
    private static List<User> users = new ArrayList<User>();

    static {
        try {
            users.add(new User("yao", "459780810@qq.com", "遵义", "18875039949", "1314159", "123-4567"));
        } catch (IllegalFormationException e) {
            e.printStackTrace();
        }

    }

    public void addUser(User user) throws LibraryNumberUsedException {
        if (!isLibraryNumberUsed(user.getLibraryNumber())) {
            users.add(user);
        } else {
            throw new LibraryNumberUsedException("the LibraryNumber was used");
        }

    }

    public static void showUserInformation() {
        System.out.println("personal information");
        for (User user : users) {
            System.out.println("userName:" + user.getName() + "  email:" + user.getEmail() + "  address:" + user.getAddress() + " phone:" + user.getPhoneNumber() + "  libraryNumber:" + user.getLibraryNumber());
        }
    }

    public static List<User> getUsers() {
        return users;
    }

    public static void setUsers(List<User> users) {
        UserStorage.users = users;
    }

    private boolean isLibraryNumberUsed(String number) {
        for (int index = 0; index < users.size(); index++) {
            if (users.get(index).getLibraryNumber().equals(number)) {
                return true;
            }
        }
        return false;
    }
}
