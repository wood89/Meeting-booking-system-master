package com.mls.booking.errors;

public class InvalidFormatException extends Exception {

    //Parameterless Constructor
    public InvalidFormatException() {
    }

    //Constructor that accepts a message
    public InvalidFormatException(final String message) {
        super(message);
    }
}
