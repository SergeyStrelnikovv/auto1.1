package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest{
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRecommendToAddWhenUnderBoundary() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRecommendToAddWhenOverBoundary() {
        int amount = 2500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotRecommendToAdd() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}