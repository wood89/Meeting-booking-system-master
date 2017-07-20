package com.mls.booking.errors;

public class InvalidDateFormatException extends InvalidFormatException {

    //Parameterless Constructor
    public InvalidDateFormatException() {
    }

    //Constructor that accepts a message
    public InvalidDateFormatException(final String message) {
        super(message);
    }

}
