package com.twu.biblioteca;

import com.twu.biblioteca.entity.Menu;

import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) {
        sendWelcomeMessage();
        int option;
        System.out.println(Menu.chooseOption());
        do {
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            scanner.nextLine();
            Menu.handleOption(option);
        } while (!Menu.isLeave(option));

    }

    public static String sendWelcomeMessage() {
        System.out.println("Welcome");
        return "Welcome";
    }
}
