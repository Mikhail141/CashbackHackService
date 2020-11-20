package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceApiTest {
    CashbackHackServiceApi serviceApi = new CashbackHackServiceApi();

    @Test
    public void shouldAmountLess1000(){
        int actual = serviceApi.remain(880);
        int expected = 120;
        assertEquals(expected, actual);
    }

}