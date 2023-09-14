package com.epam.mjc;

public class MyIllegalArgumentException extends IllegalArgumentException {
    public MyIllegalArgumentException(String s) {
        super("Could not find student with ID " + s);
    }
}
