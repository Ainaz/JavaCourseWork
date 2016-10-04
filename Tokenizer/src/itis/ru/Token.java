package itis.ru;

/**
 * Created by Ainaz on 04.10.2016.
 */
public interface Token {

    int getStartToken();

    void setStartToken(int startToken);

    int getEndToken();

    void setEndToken(int endToken);

    String getType();

    String getSubject();

    void setSubject(String subject);

    String toString();
}
