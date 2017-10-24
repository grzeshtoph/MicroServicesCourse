package demo.domain;

public class Sentence {
    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sentence sentence1 = (Sentence) o;

        return sentence != null ? sentence.equals(sentence1.sentence) : sentence1.sentence == null;
    }

    @Override
    public int hashCode() {
        return sentence != null ? sentence.hashCode() : 0;
    }
}
