package itis.ru.generic.models;

/**
 * Created by Ainaz on 05.10.2016.
 */
public class Z implements D {
    private int z;

    public Z(int z){
        this.z = z;
    }

    @Override
    public int calc() {
        return z * z;
    }
}
