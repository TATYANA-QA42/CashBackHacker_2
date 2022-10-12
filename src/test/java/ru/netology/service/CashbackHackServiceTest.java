package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldAdditionalPaymentZero() {
        // int amount = 1500;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void expectedSurcharge100() {
        // int amount = 1500;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2900);
        assertEquals(actual, expected);
    }

    @Test
    public void expectedSurcharge1000() {
        // int amount = 1500;
        int expected = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        assertEquals(actual, expected);
    }

}
