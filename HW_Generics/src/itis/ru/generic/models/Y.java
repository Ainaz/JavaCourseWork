package itis.ru.generic.models;

/**
 * Created by Ainaz on 05.10.2016.
 */
public class Y implements B {
    private int y1;
    private int y2;

    public Y(int y1, int y2){
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public int calc2() {
        return y1 + y2;
    }
}
