package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountofElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] result = turner.back(input);
        int[] expected = new int[]{5, 4, 3, 2, 1};
        assertThat(result, is(expected));

    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {



    }

}