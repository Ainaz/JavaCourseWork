package itis.ru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст: ");
        String text = " " + reader.readLine() + " ";

        Tokenizer tokenizer = new SimpleTokenizerImple();
        Token tokens[] = tokenizer.parse(text);
        System.out.println("Токены: " + Arrays.toString(tokens));
    }
}
