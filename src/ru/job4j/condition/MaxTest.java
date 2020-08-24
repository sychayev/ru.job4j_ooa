package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenLeftLessRight() {

        int res = Max.max(2, 9);
        assertThat(res, is(9));
    }

    @Test
    public void whenLeftEqualsRight() {
        int res = Max.max(9, 9);
        assertThat(res, is(9));
    }

    @Test
    public void whenLeftBiggerThanRight() {
        int res = Max.max(9, 2);
        assertThat(res, is(9));
    }
}