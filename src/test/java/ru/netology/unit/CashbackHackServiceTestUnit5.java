package ru.netology.unit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public  class CashbackHackServiceTestUnit5 {

    @Test
    public void shouldFindCashbackIfAmountMoreThanThousandSecond() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;
        int actual = cashbackHackService.remain(amount);
        int expected  = 999;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldFindCashbackIfAmountLessThanThousandSecond() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int actual = cashbackHackService.remain(amount);
        int expected  = 1;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldFindCashbackIfAmountEqualsThousandSecond() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected  = 0;
        Assertions.assertEquals(expected, actual);

    }

}