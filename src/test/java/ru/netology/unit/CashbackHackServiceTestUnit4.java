package ru.netology.unit;


public  class CashbackHackServiceTestUnit4 {
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


}