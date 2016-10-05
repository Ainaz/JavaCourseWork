package itis.ru.generic.generics;

import itis.ru.generic.models.B;
import itis.ru.generic.models.D;

/**
 * Created by Ainaz on 05.10.2016.
 */
public class Q<X extends B, Y extends B, Z extends D> {
    private X x;
    private Y y;
    private Z z;

    public Q(X x, Y y, Z z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int allCalc(){
        return x.calc2() + y.calc2() + z.calc();
    }
}
