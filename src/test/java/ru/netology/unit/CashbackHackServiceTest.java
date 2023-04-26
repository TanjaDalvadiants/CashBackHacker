package ru.netology.unit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public  class CashbackHackServiceTest {
    @org.junit.Test
    public void shouldFindCashbackIfAmountLessThanThousand() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int actual = service.remain(999);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldFindCashbackIfAmountEqualsThousand() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldFindCashbackIfAmountMoreThanThousand() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1001);

        org.junit.Assert.assertEquals(expected, actual);
    }
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