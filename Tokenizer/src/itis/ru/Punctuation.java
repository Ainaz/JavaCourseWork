package itis.ru;

/**
 * Created by Ainaz on 04.10.2016.
 */
public class Punctuation implements Token{

    public static final String PUNCTUATION = "Punctuation";

    private int startToken;
    private int endToken;
    private String subject;

    @Override
    public int getStartToken() {
        return startToken;
    }

    @Override
    public void setStartToken(int startToken) {
        this.startToken = startToken;
    }

    @Override
    public int getEndToken() {
        return endToken;
    }

    @Override
    public void setEndToken(int endToken) {
        this.endToken = endToken;
    }

    @Override
    public String getType() {
        return PUNCTUATION;
    }

    @Override
    public String getSubject() {
        return subject;
    }

    @Override
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString(){
        return subject;
    }
}
