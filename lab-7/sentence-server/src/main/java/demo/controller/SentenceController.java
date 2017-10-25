package demo.controller;

import demo.domain.Sentence;
import demo.service.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class SentenceController {

	@Autowired SentenceService sentenceService;
	
	
	/**
	 * Display a small list of Sentences to the caller:
	 */
	@GetMapping("/sentence")
	public List<Sentence> getSentences() {
	  return Arrays.asList(sentenceService.buildSentence(),
			  sentenceService.buildSentence(),
			  sentenceService.buildSentence(),
			  sentenceService.buildSentence(),
			  sentenceService.buildSentence(),
			  sentenceService.buildSentence());
	}

}
