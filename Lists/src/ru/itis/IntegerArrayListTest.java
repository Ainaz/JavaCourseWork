package ru.itis;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by KFU-user on 30.09.2016.
 */
public class IntegerArrayListTest {

    IntegerArrayList testedList;

    @Before
    public void setUp() throws Exception {
        int testData[] = {2, 5, 3, 4, 8};

        testedList = new IntegerArrayList(testData);
    }

    @Test
    public void testGet() throws Exception {
        int expected = 3;

        int actual = testedList.get(2);

        assertEquals(expected, actual);
    }


}