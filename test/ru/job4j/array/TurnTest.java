package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {8, 4, 2, 1, 7, 9};
        int[] result = Turn.back(input);
        int[] expected = new int[] {9, 7, 1, 2, 4, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {1, 4, 2, 9, 9};
        int[] result = Turn.back(input);
        int[] expected = new int[] {9, 9, 2, 4, 1};
        Assert.assertArrayEquals(expected, result);
    }
}