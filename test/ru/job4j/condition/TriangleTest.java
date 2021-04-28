package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean expected = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(expected);
    }

    @Test
    public void whenNotExist() {
        double ab = 1.5;
        double ac = 0.5;
        double bc = 3.0;
        boolean expected = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(expected);
    }
}