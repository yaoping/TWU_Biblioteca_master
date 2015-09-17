package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) {
        sendWelcomeMessage();
        Librarian.showAllBooksInformation();
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        Menu.handleOption(option);
    }

    public static String sendWelcomeMessage() {
        System.out.println("Welcome");
        return "Welcome";
    }
}
