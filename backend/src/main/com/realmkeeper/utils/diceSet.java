package com.realmkeeper.utils;

public class DiceSet 
{
    public int rollD4()
    {
        return (int)(Math.random() * 4) + 1;
    }
    public int rollD6()
    {
        return (int)(Math.random() * 6) + 1;
    }
    public int rollD8()
    {
        return (int)(Math.random() * 8) + 1;
    }
    public int rollD10()
    {
        return (int)(Math.random() * 10) + 1;
    }
    public int rollD12()
    {
        return (int)(Math.random() * 12) + 1;
    }
    public int rollD20()
    {
        return (int)(Math.random() * 20) + 1;
    }
    public int rollD100()
    {
        return (int)(Math.random() * 100) + 1;
    }    
}
