package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void whenMinFirst() {
        int[] array = new int[] {0, 50, 100};
        int result = Min.findMin(array);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[] {75, 32, 8};
        int result = Min.findMin(array);
        int expected = 8;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {121, 63, 712};
        int result = Min.findMin(array);
        int expected = 63;
        Assert.assertEquals(expected, result);
    }
}