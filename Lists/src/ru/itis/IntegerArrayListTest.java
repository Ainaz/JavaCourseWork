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
    public void testGetOnCorrectData() throws Exception {
        int expected = 3;

        int actual = testedList.get(2);

        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetOnIncorrectData() throws Exception{
        testedList.get(10);
    }

    @Test
    public void testAddOnCorrectData() throws Exception{
        int expected = 12;

        testedList.add(12);

        int actual = testedList.get(5);

        assertEquals(expected, actual);
    }

    @Test
    public void testAddByPositionOnCorrectData() throws Exception{
        int expected = 15;

        testedList.add(15, 3);

        int actual = testedList.get(3);

        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddByPositionOnIncorrectData() throws Exception{
        testedList.add(20, 7);
    }

    @Test
    public void testDeleteOnCorrectData() throws Exception{
        int expected = 8;

        testedList.delete(4);

        int actual = testedList.get(3);

        assertEquals(expected, actual);
    }

    @Test
    public  void testDeleteByPositionOnCorrectData() throws Exception{
        int expected = 4;

        testedList.deleteByPosition(2);

        int actual = testedList.get(2);

        assertEquals(expected, actual);
    }

    @Test
    public void testFindOnCorrectData() throws Exception{
        int expected = 3;

        int actual = testedList.find(4);

        assertEquals(expected, actual);
    }

}