package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForThreeThenSix(){
        int rsl = Factorial.calc(3);
        assertThat(rsl,is(6));
    }

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int rsl = Factorial.calc(5);
        assertThat(rsl,is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne(){
        int rsl = Factorial.calc(0);
        assertThat(rsl,is(1));
    }
}