package ru.netology.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    @Test
    void shouldFindCashbackIfAmountMoreThanThousand() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;
        int actual = cashbackHackService.remain(amount);
        int expected  = 999;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    void shouldFindCashbackIfAmountLessThanThousand() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int actual = cashbackHackService.remain(amount);
        int expected  = 1;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    void shouldFindCashbackIfAmountEqualsThousand() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected  = 0;
        Assertions.assertEquals(expected, actual);

    }

}