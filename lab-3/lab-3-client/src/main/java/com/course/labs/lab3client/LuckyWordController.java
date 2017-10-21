package com.course.labs.lab3client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckyWordController {

    @Value("${lucky-word}")
    private String luckyWord;

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @GetMapping("/lucky-word")
    public String showLuckyWord() {
        return "The lucky word is " + luckyWord + " (profile " + activeProfile + ")";
    }
}
