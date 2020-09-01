package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void findFirstMin() {
        assertThat(Min.findMin(new int[]{0, 5, 10}), is(0));
    }

    @Test
    public void findLastMin() {
        assertThat(Min.findMin(new int[]{10, 5, 3}), is(3));
    }

    @Test

    public void findMiddleMin() {
        assertThat(Min.findMin(new int[]{10, 2, 5}), is(2));
    }
}