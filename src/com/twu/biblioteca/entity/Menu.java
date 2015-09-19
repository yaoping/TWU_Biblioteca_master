package com.twu.biblioteca.entity;

import com.twu.biblioteca.Handler.BookHandler;
import com.twu.biblioteca.Handler.LoginHandler;
import com.twu.biblioteca.Handler.MovieHandler;
import com.twu.biblioteca.Storage.UserStorage;

import java.util.Scanner;

public class Menu {
    public static String chooseOption() {
        StringBuffer option = new StringBuffer();
        option.append("1 ---listBooks\n");
        option.append("2 ---listMovies\n");
        option.append("4 ---user information\n");
        option.append("5 ---checkout Book\n");
        option.append("6 ---return Book\n");
        option.append("3 ---login\n");
        option.append("0 ---quit");
        return option.toString();
    }

    public static void handleOption(int option) {
        BookHandler bookHandler = new BookHandler();
        Scanner scanner = new Scanner(System.in);
        if (isValidOption(option)) {
            switch (option) {
                case 1:
                    BookHandler.showAllBooksInformation();
                    break;
                case 2:
                    MovieHandler.showAllMoviesInformation();
                    break;
                case 3:
                    LoginHandler.login();
                    break;
                case 4:
                    if (LoginHandler.login()) {
                        UserStorage.showUserInformation();
                    }
                    break;
                case 5:
                    if (LoginHandler.login()) {
                        bookHandler.checkoutBook(scanner.nextLine());
                    }
                    break;
                case 6:
                    bookHandler.returnBook(scanner.nextLine());
                    break;
                case 0:
                    System.exit(0);
            }
        } else {
            System.out.println(showWrongOptionMessage());
        }
    }

    public static boolean isValidOption(int option) {
        return (option >= 0 && option <= 9) ? true : false;
    }

    private static String showWrongOptionMessage() {
        return "Select a valid option";
    }

    public static boolean isLeave(int option) {
        return option == 0;
    }

}
