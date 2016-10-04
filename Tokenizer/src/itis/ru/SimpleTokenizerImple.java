package itis.ru;

/**
 * Created by Ainaz on 04.10.2016.
 */
public class SimpleTokenizerImple implements Tokenizer {

    private char[] letters = {'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', 'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l','M', 'm', 'N', 'n', 'O', 'o', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', 'U', 'u', 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y', 'Z', 'z'};
    private char[] numbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    private char[] punctuations = {'.', ',', '!', '?', ';', ':', '"', '-', '(', ')'};

    @Override
    public Token[] parse(String text) {

        char[] textChars = text.toCharArray();
        Token[] tokens = new Token[textChars.length/ 2];
        String subject = "";
        int tokenCounter = 0;
        boolean tokenIsWord = false;
        boolean tokenIsNumber = false;

        for (int i = 1; i < textChars.length; i++) {
            if(!tokenIsNumber){
                for (char letter : this.letters) {
                    if (textChars[i] == letter){
                        if (textChars[i - 1] == ' '){
                            tokens[tokenCounter] = new Word();
                            tokens[tokenCounter].setStartToken(i);
                            subject = "";
                            tokenIsWord = true;
                        }
                        subject = subject + textChars[i];
                        if (textChars[i + 1] == ' ') {
                            tokens[tokenCounter].setEndToken(i);
                            tokens[tokenCounter].setSubject(subject);
                            tokenCounter++;
                            tokenIsWord = false;
                        }
                        break;
                    }
                }
            }
            if (!tokenIsWord){
                for (char number : this.numbers) {
                    if (textChars[i] == number){
                        if (textChars[i - 1] == ' '){
                            tokens[tokenCounter] = new Number();
                            tokens[tokenCounter].setStartToken(i);
                            subject = "";
                            tokenIsNumber = true;
                        }
                        subject = subject + textChars[i];
                        if (textChars[i + 1] == ' '){
                            tokens[tokenCounter].setEndToken(i);
                            tokens[tokenCounter].setSubject(subject);
                            tokenCounter++;
                            tokenIsNumber = false;
                        }
                        break;
                    }
                }
            }
            if (!tokenIsWord && !tokenIsNumber){
                for (char punctuation : punctuations) {
                    if (textChars[i] == punctuation){
                            tokens[tokenCounter] = new Punctuation();
                            tokens[tokenCounter].setStartToken(i);
                            tokens[tokenCounter].setEndToken(i);
                            subject = "";
                            subject = subject + textChars[i];
                            tokens[tokenCounter].setSubject(subject);
                            tokenCounter++;
                        break;
                    }
                }
            }
        }
        return tokens;
    }
}
