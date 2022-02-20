package com.example.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokesServiceImpl implements JokeService{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }
    @Override
    public String getJokes(){
        return chuckNorrisQuotes.getRandomQuote();
    }
    
}
