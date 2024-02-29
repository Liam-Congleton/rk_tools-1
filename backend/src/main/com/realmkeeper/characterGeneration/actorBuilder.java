package com.realmkeeper.characterGeneration;
import com.realmkeeper.characterGeneration.playerClasses.*;
import com.realmkeeper.utils.CharacterMath;

public class actorBuilder
{
    protected ClassStrategy actorClassStrategy;
    public String actorClassName;
    private CharacterMath characterMath = new CharacterMath();
    
    protected int[] assignActorClass(int[] attributes, int classId, int actorLevel) //Default to Barbarian lvl 1
    {
        ClassStrategy actorClass = ClassStrategyFactory.getClassStrategy(classId);
        this.actorClassStrategy = actorClass; // Typecast to ClassStrategy
        this.actorClassName = actorClass.getClassName(); // Return Classname
        actorClass.actorAbilities = actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
        return actorClass.actorAbilities;
    }
<<<<<<< HEAD
=======
    protected String getAlignment()
    {
        System.out.println("Assigning Alignment");
        String alignmentString = this.actorClassStrategy.getRandomWeightedAlignment().toString();
        return alignmentString; 
    }
    protected void getEquipment()
    {
        this.actorClassStrategy.assignEquipment();
    }
>>>>>>> 6cfaaaa697e1b964bbcc2f898ba8215810870f0b
}
