package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenFiveToFifteen() {
        int rsl = Counter.sumByEven(5,15);
        int expected = 65;
        assertThat(rsl,is(expected));
    }

    @Test
    public void whenTreeToNine() {
        int rsl = Counter.sumByEven(3,9);
        int expected = 27;
        assertThat(rsl,is(expected));
    }
    @Test
    public void whenSixToSixteen(){
        int rsl = Counter.sumByEven(6,16);
        int expected = 82;
        assertThat(rsl,is(expected));
    }
}