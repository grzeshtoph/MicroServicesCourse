package com.course.lab.noun;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NounController {
    @Value("${words}")
    private String words;

    @GetMapping("/")
    public String getNoun() {
        String[] wordsArray = words.split(",");
        int i = (int) Math.round(Math.random() * (wordsArray.length - 1));
        return wordsArray[i];
    }
}
