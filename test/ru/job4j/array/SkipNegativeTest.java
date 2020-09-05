package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SkipNegativeTest {

    @Test
    public void skip1() {
        int[][] in = {{1, -2}, {1, 2}};
        int[][] expect = {{1, 0}, {1, 2}};
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }

    @Test
    public void skip2() {
        int[][] in = {{-1, -2}, {1, 2}, {98, -123, 6}};
        int[][] expect = {{0, 0}, {1, 2}, {98, 0, 6}};
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }

    @Test
    public void skip3() {
        int[][] in = {{12, 98, 45}, {-987, -45, -6}, {678, -367, -7}};
        int[][] expect = {{12, 98, 45}, {0, 0, 0}, {678, 0, 0}};
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }
}