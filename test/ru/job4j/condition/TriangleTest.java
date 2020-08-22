package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public  void exist() {
        boolean res = Triangle.exist(2.0,2.0,2.0);
        assertThat(res,is(true));
    }
}