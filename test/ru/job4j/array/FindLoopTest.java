package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int expected = 0;
        int out = FindLoop.indexOf(data, el);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenArrayHaveNot6ThenMinus1() {
        int[] data = {3, 7, 1, 9, 8, 2, -5};
        int el = 6;
        int expected = -1;
        int out = FindLoop.indexOf(data, el);
        Assert.assertEquals(expected, out);
    }
}