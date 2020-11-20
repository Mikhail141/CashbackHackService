package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldAmountLess1000(){

        int actual = service.remain(880);
        int expected = 120;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldAmountZero(){

        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldAmount1000(){

        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual,expected);
    }

}