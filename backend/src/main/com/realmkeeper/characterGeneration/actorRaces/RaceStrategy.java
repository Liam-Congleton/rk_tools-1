package com.realmkeeper.characterGeneration.actorRaces;

public class RaceStrategy 
{
    public int[] actorAbilities; // Array to store actor abilities    

    public int[] adjustAttributesForRace(int[] attributes) 
    {
        actorAbilities [0] = 100; 
        return attributes;    
    }

    public RaceStrategy getRaceStrategy(int raceId) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getRaceStrategy'");
    }

    public String getRaceName() 
    {
        return "FALLBACK RACE";
    }
}
