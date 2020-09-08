package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort1() {

        int[] input = new int[]{3,  1, 2};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3};
        assertThat(result, is(expect)
        );
    }

    @Test
    public void whenSort2() {
        int[] input = new int[]{8, 7, 9, 6, 1};
        int[] result = SortSelected.sort(input);
        int expect[] = new int[]{1, 6, 7, 8, 9};
        assertThat(result, is(expect));

    }

    @Test
    public void whenSort3() {
        int[] input = new int[]{23, 10, 45, 2};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{2, 10, 23, 45};
        assertThat(result, is(expect));

    }
}