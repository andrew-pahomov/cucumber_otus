package com.otus.exceptions;

public class BrowserNotSupported extends Exception {

    public BrowserNotSupported(String browserName) {
        super(String.format("Browser %s not suppported", browserName));
    }

}
