package com.twu.biblioteca.entity;

import com.twu.biblioteca.exception.IllegalFormationException;

public class User {
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String password;
    private String libraryNumber;

    public User(String name, String email, String address, String phoneNumber, String password, String libraryNumber) throws IllegalFormationException {
        this.name=name;
        this.email=email;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.password=password;
        if(isValid(libraryNumber)){
            this.libraryNumber=libraryNumber;
        }else {
             throw new IllegalFormationException("your library number is not valid");
        }
    }

    private boolean isValid(String libraryNumber){
        return libraryNumber.matches("^[A-Za-z0-9]{3}\\-[A-Za-z0-9]{4}+$");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public void setLibraryNumber(String libraryNumber) {
        this.libraryNumber = libraryNumber;
    }
}
