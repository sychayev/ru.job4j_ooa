package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distanceFirst() {
        int x1 = 9;
        int y1 = 3;
        int x2 = 7;
        int y2 = 13;
        double expected = 10.19;
        double out = Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(expected,out,0.01);

    }
}