package com.twu.biblioteca;

public class Menu {
    public static void showMenuOption() {
        StringBuffer menuOption = new StringBuffer();
        menuOption.append("1 ---listBooks\n");
        menuOption.append("0 ---quit");
        System.out.println(menuOption.toString());
    }

    public static void handleOption(int option) {
        if (isValidOption(option)) {
            switch (option) {
                case 1:
                    Librarian.showAllBooksInformation();
                case 0:
                    System.exit(0);
            }
        } else {
            System.out.println(showWrongOptionMessage());
        }
    }

    public static boolean isValidOption(int option) {
        return (option == 1 || option == 0) ? true : false;
    }

    private static String showWrongOptionMessage() {
        return "Select a valid option";
    }

}
