package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void when1Year() {
        int amount = 1000;
        int salary = 1200;
        double percent = 1;
        int expected = 1;
        int result = Mortgage.year(amount, salary, percent);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when2Years() {
        int amount = 100;
        int salary = 120;
        double percent = 50;
        int expected = 2;
        int result = Mortgage.year(amount, salary, percent);
        Assert.assertEquals(expected, result);
    }
}