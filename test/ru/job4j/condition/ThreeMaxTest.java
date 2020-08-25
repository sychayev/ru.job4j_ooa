package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ThreeMaxTest {

    @Test
    public void firstMax() {
        int rsl = ThreeMax.max(10,5,1);
        assertThat(rsl,is(10));
    }
    @Test
    public void secondMax() {
        int rsl = ThreeMax.max(10,50,1);
        assertThat(rsl,is(50));
    }
    @Test
    public void thirdMax() {
        int rsl = ThreeMax.max(11,12,13);
        assertThat(rsl,is(13));
    }

}