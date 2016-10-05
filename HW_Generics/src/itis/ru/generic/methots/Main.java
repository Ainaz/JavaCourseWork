package itis.ru.generic.methots;

import itis.ru.generic.models.X;
import itis.ru.generic.models.Y;
import itis.ru.generic.models.Z;
import itis.ru.generic.generics.Q;

public class Main {

    public static void main(String[] args) {

        X x = new X(5, 7);
        Y y = new Y(8, 28);
        Z z = new Z(10);

        Q<X, Y, Z> q = new Q<>(x, y, z);

        System.out.println(q.allCalc());
    }
}
