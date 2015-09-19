package com.twu.biblioteca.exception;


public class RateOutRangeException extends Exception{
    public RateOutRangeException(String errorMessage){
        super(errorMessage);
    }
}
