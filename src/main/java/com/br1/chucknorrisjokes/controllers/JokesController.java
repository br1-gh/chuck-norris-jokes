package com.br1.chucknorrisjokes.controllers;

import com.br1.chucknorrisjokes.services.QuoteService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private QuoteService quoteService;

    public JokesController(@Qualifier("chuckNorrisJokesQuoteService") QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        String joke = quoteService.getRandomQuote();

        model.addAttribute("joke", joke);

        return "chucknorris";
    }

}
