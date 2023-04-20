package ru.netology.unit;

import org.junit.Assert;
import org.junit.Test;



public  class CashbackHackServiceTest {
    @Test
    public void shouldFindCashbackIfAmountMoreThanThousand() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;
        int actual = cashbackHackService.remain(amount);
        int expected  = 999;
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void shouldFindCashbackIfAmountLessThanThousand() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int actual = cashbackHackService.remain(amount);
        int expected  = 1;
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void shouldFindCashbackIfAmountEqualsThousand() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected  = 0;
        Assert.assertEquals(expected, actual);

    }

}