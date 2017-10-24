package demo.dao;

import demo.domain.Word;
import org.springframework.web.bind.annotation.GetMapping;


public interface WordClient {
    @GetMapping("/")
    Word getWord();

}
