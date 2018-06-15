package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.commencis.jokeactivity.JokeActivity;


public class MainActivity extends AppCompatActivity implements JokeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tellJoke(View view) {
        JokeAsyncTask jokeAsyncTask = new JokeAsyncTask();
        jokeAsyncTask.execute(this);
    }

    @Override
    public void onPostJoke(String joke) {
        startActivity(JokeActivity.newIntent(this, joke));
    }
}
