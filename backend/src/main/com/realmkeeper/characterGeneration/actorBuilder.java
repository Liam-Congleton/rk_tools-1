package com.realmkeeper.characterGeneration;
import com.realmkeeper.characterGeneration.actorClasses.*;
import com.realmkeeper.characterGeneration.actorRaces.RaceStrategy;
import com.realmkeeper.utils.CharacterMath;

public class actorBuilder
{
    protected ClassStrategy actorClassStrategy;
    protected RaceStrategy actorRaceStrategy;
    public String actorClassName;
    public String actorRaceName;
    private CharacterMath characterMath = new CharacterMath();
    
    protected int[] assignActorClass(int[] attributes, int classId, int actorLevel) //Default to Barbarian lvl 1
    {
        ClassStrategy actorClass = ClassStrategyFactory.getClassStrategy(classId);
        this.actorClassStrategy = actorClass; // Typecast to ClassStrategy
        this.actorClassName = actorClass.getClassName(); // Return Classname
        actorClass.actorAbilities = actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
        return actorClass.actorAbilities;
    }
    protected int[] assignActorRace(int[] attributes, int raceId) 
    {
        RaceStrategy actorRace = actorRaceStrategy.getRaceStrategy(raceId); // Get the race strategy
        this.actorRaceStrategy = actorRace; // Typecast to RaceStrategy
        this.actorRaceName = actorRace.getRaceName(); // Return Racename
        attributes = actorRaceStrategy.adjustAttributesForRace(attributes); // Adjust attributes
        return attributes; // Return the adjusted attributes
    }
}
