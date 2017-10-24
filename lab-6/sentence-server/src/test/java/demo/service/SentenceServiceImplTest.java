package demo.service;

import demo.dao.*;
import demo.domain.Sentence;
import demo.domain.Word;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.util.ReflectionTestUtils;

public class SentenceServiceImplTest {

    //	Class under test:
    SentenceServiceImpl service;

    @Before
    public void setup() {

        service = new SentenceServiceImpl();

        //	Establish Mock Dependencies:
        WordClient subject = Mockito.mock(SubjectClient.class);
        WordClient verb = Mockito.mock(VerbClient.class);
        WordClient article = Mockito.mock(ArticleClient.class);
        WordClient adjective = Mockito.mock(AdjectiveClient.class);
        WordClient noun = Mockito.mock(NounClient.class);

        ReflectionTestUtils.setField(service, "subjectService", subject);
        ReflectionTestUtils.setField(service, "verbService", verb);
        ReflectionTestUtils.setField(service, "articleService", article);
        ReflectionTestUtils.setField(service, "adjectiveService", adjective);
        ReflectionTestUtils.setField(service, "nounClient", noun);

        //	Describe Mock Behaviors:
        Mockito.when(subject.getWord()).thenReturn(new Word("1"));
        Mockito.when(verb.getWord()).thenReturn(new Word("2"));
        Mockito.when(article.getWord()).thenReturn(new Word("3"));
        Mockito.when(adjective.getWord()).thenReturn(new Word("4"));
        Mockito.when(noun.getWord()).thenReturn(new Word("5"));
    }

    @Test
    public void test() {
        //	We should get the sentence built in the correct order:
        Assert.assertEquals(new Sentence("1 2 3 4 5."), service.buildSentence());
    }

}
