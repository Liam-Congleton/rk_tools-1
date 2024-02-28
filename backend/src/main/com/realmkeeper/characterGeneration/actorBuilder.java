package com.realmkeeper.characterGeneration;
import com.realmkeeper.characterGeneration.playerClasses.*;
import com.realmkeeper.utils.CharacterMath;

public class actorBuilder
{
    public ClassStrategy actorClassStrategy;
    public String actorClass;
    private CharacterMath characterMath = new CharacterMath();
    
    protected int[] assignActorClass(int[] attributes, int classId, int actorLevel) //Default to Barbarian lvl 1
    {
        switch (classId) 
        {
            case 1:
                    BarbarianStrategy barbarian = new BarbarianStrategy();
                    this.actorClassStrategy = (ClassStrategy) barbarian; // Typecast to ClassStrategy
                    this.actorClass = barbarian.getClassName(); // Return Classname
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
            case 2:
                    BardStrategy bard = new BardStrategy();
                    this.actorClassStrategy = (ClassStrategy) bard; // Typecast to ClassStrategy
                    this.actorClass = bard.getClassName();
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
            case 3:
                    ClericStrategy cleric = new ClericStrategy();
                    this.actorClassStrategy = (ClassStrategy) cleric; // Typecast to ClassStrategy
                    this.actorClass = cleric.getClassName();
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes                
            case 4:
                    DruidStrategy Druid = new DruidStrategy();
                    this.actorClassStrategy = (ClassStrategy) Druid; // Typecast to ClassStrategy
                    this.actorClass = Druid.getClassName();
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
            case 5:
                    FighterStrategy Fighter = new FighterStrategy();
                    this.actorClassStrategy = (ClassStrategy) Fighter; // Typecast to ClassStrategy
                    this.actorClass = Fighter.getClassName();
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
            case 6:
                    MonkStrategy Monk = new MonkStrategy();
                    this.actorClassStrategy = (ClassStrategy) Monk; // Typecast to ClassStrategy
                    this.actorClass = Monk.getClassName();
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
            case 7:
                    PaladinStrategy Paladin = new PaladinStrategy();
                    this.actorClassStrategy = (ClassStrategy) Paladin; // Typecast to ClassStrategy
                    this.actorClass = Paladin.getClassName();
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
            case 8:
                    RangerStrategy Ranger = new RangerStrategy();
                    this.actorClassStrategy = (ClassStrategy) Ranger; // Typecast to ClassStrategy
                    this.actorClass = Ranger.getClassName();
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
            case 9:
                    RogueStrategy Rogue = new RogueStrategy();
                    this.actorClassStrategy = (ClassStrategy) Rogue; // Typecast to ClassStrategy
                    this.actorClass = Rogue.getClassName();
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
            case 10:
                    SorcererStrategy Sorcerer = new SorcererStrategy();
                    this.actorClassStrategy = (ClassStrategy) Sorcerer; // Typecast to ClassStrategy
                    this.actorClass = Sorcerer.getClassName();
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
            case 11:
                    WarlockStrategy Warlock = new WarlockStrategy();
                    this.actorClassStrategy = (ClassStrategy) Warlock; // Typecast to ClassStrategy
                    this.actorClass = Warlock.getClassName();
                    return actorClassStrategy.assignAttributes(characterMath.rollAttributes(6));
            case 12:
                    WizardStrategy Wizard = new WizardStrategy();
                    this.actorClassStrategy = (ClassStrategy) Wizard; // Typecast to ClassStrategy
                    this.actorClass = Wizard.getClassName();
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
