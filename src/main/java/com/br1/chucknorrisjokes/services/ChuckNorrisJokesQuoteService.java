package com.br1.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokesQuoteService implements QuoteService {

    ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokesQuoteService() {
        if (this.chuckNorrisQuotes == null)
            this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
