package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
//@ConfigurationProperties("wordConfig")
@RefreshScope
@Scope("prototype")
public class LuckyWordController {
	@Value("${wordConfig.luckyWord}")
	private String luckyWord;

	@Value("${wordConfig.preamble}")
	private String preamble;

	private String fullSentence;

	@PostConstruct
	public void init() {
		fullSentence = preamble + ": " + luckyWord;
	}
	
	@GetMapping("/lucky-word")
	public String showLuckyWord() {
		return fullSentence;
	}
}
