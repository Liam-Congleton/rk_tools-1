package com.realmkeeper.characterGeneration.actorRaces;

public class HumanStrategy extends RaceStrategy
{
    public int[] adjustAttributesForRace(int[] attributes) 
    {
        attributes[0] = attributes[0] + 1;
        attributes[1] = attributes[1] + 1;
        attributes[2] = attributes[2] + 1;
        attributes[3] = attributes[3] + 1;
        attributes[4] = attributes[4] + 1;
        attributes[5] = attributes[5] + 1;
        return attributes;    
    }
    public RaceStrategy getRaceStrategy(int raceId) 
    {
        return new HumanStrategy();
    }
}
