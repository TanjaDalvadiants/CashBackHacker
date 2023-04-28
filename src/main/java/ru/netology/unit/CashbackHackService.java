package ru.netology.unit;

public class CashbackHackService {
    public int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}
