package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void max() {

        int res = Max.max(2,9);
        assertThat(res,is(9));

    }
}