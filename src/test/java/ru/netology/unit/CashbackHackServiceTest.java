package ru.netology.unit;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;




public class CashbackHackServiceTest {
    @BeforeTest
    public void shouldFindCashbackIfAmountMoreThanThousand() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;
        int actual = cashbackHackService.remain(amount);
        int expected  = 999;
        Assert.assertEquals(actual, expected);

    }
    @BeforeTest
    public void shouldFindCashbackIfAmountLessThanThousand() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int actual = cashbackHackService.remain(amount);
        int expected  = 1;
        Assert.assertEquals(expected, actual);

    }
    @BeforeTest
    public void shouldFindCashbackIfAmountEqualsThousand() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected  = 0;
        Assert.assertEquals(expected, actual);

    }

}