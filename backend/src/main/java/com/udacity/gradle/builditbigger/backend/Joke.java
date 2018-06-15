package com.udacity.gradle.builditbigger.backend;

/**
 * The object model for the data we are sending through endpoints
 */
public class Joke {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String string) {
        text = string;
    }
}