package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldAmountLess1000(){
        int actual = service.remain(880);
        int expected = 120;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountZero(){
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmount1000(){
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

}