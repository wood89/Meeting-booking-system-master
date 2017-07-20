package com.mls.booking.errors;

public class InvalidFileFormatException extends Exception {

    //Parameterless Constructor
    public InvalidFileFormatException() {
    }

    //Constructor that accepts a message
    public InvalidFileFormatException(final String message) {
        super(message);
    }
}
