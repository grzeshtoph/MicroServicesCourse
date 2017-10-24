package com.course.labs.sentence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SentenceController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/sentence")
    public String getSentence() {
        return String.format("%s %s %s %s %s.",
                getWord("LAB-5-SUBJECT"),
                getWord("LAB-5-VERB"),
                getWord("LAB-5-ARTICLE"),
                getWord("LAB-5-ADJECTIVE"),
                getWord("LAB-5-NOUN"));
    }

    private String getWord(String serviceName) {
        return restTemplate.getForObject("http://" + serviceName, String.class);

    }
}
