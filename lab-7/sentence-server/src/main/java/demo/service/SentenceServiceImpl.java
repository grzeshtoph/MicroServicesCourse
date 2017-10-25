package demo.service;

import demo.dao.*;
import demo.domain.Sentence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Build a sentence by assembling randomly generated subjects, verbs,
 * articles, adjectives, and nouns.  The individual parts of speech will
 * be obtained by calling the various DAOs.
 */
@Service
public class SentenceServiceImpl implements SentenceService {
    @Autowired
    private VerbClient verbService;
    @Autowired
    private SubjectClient subjectService;
    @Autowired
    private ArticleClient articleService;
    @Autowired
    private AdjectiveClient adjectiveService;
    @Autowired
    private NounClient nounClient;

    /**
     * Assemble a sentence by gathering random words of each part of speech:
     */
    public Sentence buildSentence() {
        return new Sentence(String.format("%s %s %s %s %s.",
                subjectService.getWord().getString(),
                verbService.getWord().getString(),
                articleService.getWord().getString(),
                adjectiveService.getWord().getString(),
                nounClient.getWord().getString()));
    }
}
