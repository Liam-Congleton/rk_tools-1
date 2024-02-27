package com.realmkeeper.characterGeneration;
import com.realmkeeper.characterGeneration.playerClasses.*;
import com.realmkeeper.utils.CharacterMath;

public class actorBuilder
{
    public String ActorId; 
    public String actorClass;
    public ClassStrategy actorClassStrategy;
    private CharacterMath characterMath = new CharacterMath();
    
    protected int[] assignActorClass(int[] attributes, int classId, int actorLevel) //Default to Barbarian lvl 1
    {
        switch (classId) 
        {
            case 1: //Barbarian
                    actorClass = "Barbarian";
                    BarbarianStrategy barbarian = new BarbarianStrategy();
                    this.actorClassStrategy = (ClassStrategy) barbarian; // Typecast to ClassStrategy
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
            case 2: //Barbarian
                    actorClass = "Bard";
                    BardStrategy bard = new BardStrategy();
                    this.actorClassStrategy = (ClassStrategy) bard; // Typecast to ClassStrategy
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
            case 3: //Barbarian
                    actorClass = "Cleric";
                    ClericStrategy cleric = new ClericStrategy();
                    this.actorClassStrategy = (ClassStrategy) cleric; // Typecast to ClassStrategy
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes                
            case 4: //Barbarian
                    actorClass = "Druid";
                    DruidStrategy Druid = new DruidStrategy();
                    this.actorClassStrategy = (ClassStrategy) Druid; // Typecast to ClassStrategy
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
            case 5: //Barbarian
                    actorClass = "Fighter";
                    FighterStrategy Fighter = new FighterStrategy();
                    this.actorClassStrategy = (ClassStrategy) Fighter; // Typecast to ClassStrategy
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
            case 6: //Barbarian
                    actorClass = "Monk";
                    MonkStrategy Monk = new MonkStrategy();
                    this.actorClassStrategy = (ClassStrategy) Monk; // Typecast to ClassStrategy
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
            case 7: //Barbarian
                    actorClass = "Paladin";
                    PaladinStrategy Paladin = new PaladinStrategy();
                    this.actorClassStrategy = (ClassStrategy) Paladin; // Typecast to ClassStrategy
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
            case 8: //Barbarian
                    actorClass = "Ranger";
                    RangerStrategy Ranger = new RangerStrategy();
                    this.actorClassStrategy = (ClassStrategy) Ranger; // Typecast to ClassStrategy
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
            case 9: //Barbarian
                    actorClass = "Rogue";
                    RogueStrategy Rogue = new RogueStrategy();
                    this.actorClassStrategy = (ClassStrategy) Rogue; // Typecast to ClassStrategy
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
            case 10: //Barbarian
                    actorClass = "Sorcerer";
                    SorcererStrategy Sorcerer = new SorcererStrategy();
                    this.actorClassStrategy = (ClassStrategy) Sorcerer; // Typecast to ClassStrategy
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
            case 11: //Barbarian
                    actorClass = "Warlock";
                    WarlockStrategy Warlock = new WarlockStrategy();
                    this.actorClassStrategy = (ClassStrategy) Warlock; // Typecast to ClassStrategy
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6));
            case 12: //Barbarian
                    actorClass = "Wizard";
                    WizardStrategy Wizard = new WizardStrategy();
                    this.actorClassStrategy = (ClassStrategy) Wizard; // Typecast to ClassStrategy
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6));
            default:
                System.out.println("Invalid Class ID");
                break;
        }
        return attributes;
    }
    protected int setActorHealth()
    {
        return 0;
    }
    
}
