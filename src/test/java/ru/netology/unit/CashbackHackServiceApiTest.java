package ru.netology.unit;



import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class CashbackHackServiceApiTest {
    CashbackHackServiceApi serviceApi = new CashbackHackServiceApi();

    @Test
    public void shouldAmountLess1000(){
        int actual = serviceApi.remain(880);
        int expected = 120;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountZero(){
        int actual = serviceApi.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmount1000(){
        int actual = serviceApi.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

}