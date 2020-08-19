package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeightTest() {

        short in = 150;
        double expected = 57.49;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out,0.01);

    }


    @Test
    public void womanWeight() {

        short in = 130;
        double expected = 34.5;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out,0.01);
    }
}