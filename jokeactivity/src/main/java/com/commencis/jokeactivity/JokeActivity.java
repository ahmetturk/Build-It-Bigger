package com.commencis.jokeactivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    private static final String JOKE_EXTRA = "joke";

    public static Intent newIntent(Context context, String joke) {
        Intent intent = new Intent(context, JokeActivity.class);
        intent.putExtra(JOKE_EXTRA, joke);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String joke = getIntent().getStringExtra(JOKE_EXTRA);

        TextView textViewJoke = findViewById(R.id.textViewJoke);
        textViewJoke.setText(joke);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
