package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MorgageTest {

    @Test
    public void when1Year() {
        int year = Morgage.year(1000, 1200, 1);
        assertThat(year, is(1));
    }

    @Test
    public void when2Year() {
        int year = Morgage.year(100, 120, 50);
        assertThat(year, is(2));
    }
}