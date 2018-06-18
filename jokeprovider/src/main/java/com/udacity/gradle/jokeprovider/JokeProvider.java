package com.udacity.gradle.jokeprovider;

import java.util.Random;

import javax.swing.text.View;

public class JokeProvider {

    private static final String [] jokes = {
            "Q. A girl fell off of a 30-foot ladder, but she didn't get hurt at all. How is this possible?\nA. She fell off the bottom step!",
            "Q. A magician promises that he can throw a ball as hard as he can and have it stop, change direction, and come back to him. He claims he can do it without the ball bouncing off of anything, the ball being tied to anything, or the use of magnets. How is this possible?\nA. He throws the ball straight up in the air!",
            "Q. I'm an odd number. If you take away one of the letters in my name, I become even. What number am I?\nA. Seven. (Take away the S!)",
            "Q. There are three apples on a table and you take away two of them. How many apples do you have now?\nA. Two, of course!",
            "Q. Can you name three consecutive days without using the words \"Wednesday,\" \"Friday,\" or \"Sunday\"?\nA. Yesterday, today, and tomorrow."
    };

    public static String getJoke() {
        return jokes[new Random().nextInt(jokes.length)];
    }

}
