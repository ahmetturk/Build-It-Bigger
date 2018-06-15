package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.text.IsEmptyString.isEmptyOrNullString;
import static org.junit.Assert.assertThat;

@RunWith(AndroidJUnit4.class)
public class JokeTest {

    @Test
    public void validateJokeAsyncTask() {
        JokeAsyncTask jokeAsyncTask = new JokeAsyncTask();
        jokeAsyncTask.execute(new JokeListener() {
            @Override
            public void onPostJoke(String joke) {
                assertThat(joke, not(isEmptyOrNullString()));
            }
        });
    }
}
