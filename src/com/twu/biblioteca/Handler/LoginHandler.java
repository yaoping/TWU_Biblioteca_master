package com.twu.biblioteca.Handler;

import com.twu.biblioteca.Storage.UserStorage;
import com.twu.biblioteca.entity.User;

import java.util.Scanner;

public class LoginHandler {
    public static boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input the library number");
        String number = scanner.nextLine();
        System.out.println("please input the password");
        String password = scanner.nextLine();
        if (isLoginSuccessfully(number, password)) {
            System.out.println("login successfully");
            return true;
        } else {
            System.out.println("the library number or password wrong");
            return false;
        }
    }

    public static boolean isLoginSuccessfully(String libraryNumber, String password) {
        for (User user : UserStorage.getUsers()) {
            if (user.getLibraryNumber().equals(libraryNumber) && user.getPassword().equals(password)) {
                return true;

            }
        }
        return false;

    }
}
