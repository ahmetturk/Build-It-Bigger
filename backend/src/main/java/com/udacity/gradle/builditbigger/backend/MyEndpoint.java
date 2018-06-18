package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.udacity.gradle.jokeprovider.JokeProvider;

@Api(
        name = "jokeApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /**
     * returns a Joke by using JokeProvider java library
     */
    @ApiMethod(name = "getJoke")
    public Joke getJoke() {
        Joke joke = new Joke();
        joke.setText(JokeProvider.getJoke());

        return joke;
    }

}
