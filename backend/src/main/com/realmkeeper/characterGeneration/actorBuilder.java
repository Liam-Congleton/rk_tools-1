package com.realmkeeper.characterGeneration;
import com.realmkeeper.characterGeneration.playerClasses.*;
import com.realmkeeper.utils.CharacterMath;

public class actorBuilder
{
    protected ClassStrategy actorClassStrategy;
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
                    barbarian.actorAbilities = actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
                    return barbarian.actorAbilities;
            case 2:
                    BardStrategy bard = new BardStrategy();
                    this.actorClassStrategy = (ClassStrategy) bard; // Typecast to ClassStrategy
                    this.actorClass = bard.getClassName();
                    bard.actorAbilities = actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
                    return bard.actorAbilities;
            case 3:
                    ClericStrategy cleric = new ClericStrategy();
                    this.actorClassStrategy = (ClassStrategy) cleric; // Typecast to ClassStrategy
                    this.actorClass = cleric.getClassName();
                    cleric.actorAbilities = actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
                    return cleric.actorAbilities;                
            case 4:
                    DruidStrategy Druid = new DruidStrategy();
                    this.actorClassStrategy = (ClassStrategy) Druid; // Typecast to ClassStrategy
                    this.actorClass = Druid.getClassName();
                    Druid.actorAbilities = actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
                    return Druid.actorAbilities;
            case 5:
                    FighterStrategy Fighter = new FighterStrategy();
                    this.actorClassStrategy = (ClassStrategy) Fighter; // Typecast to ClassStrategy
                    this.actorClass = Fighter.getClassName();
                    Fighter.actorAbilities = actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
                    return Fighter.actorAbilities;
            case 6:
                    MonkStrategy Monk = new MonkStrategy();
                    this.actorClassStrategy = (ClassStrategy) Monk; // Typecast to ClassStrategy
                    this.actorClass = Monk.getClassName();
                    Monk.actorAbilities = actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
                    return Monk.actorAbilities;
            case 7:
                    PaladinStrategy Paladin = new PaladinStrategy();
                    this.actorClassStrategy = (ClassStrategy) Paladin; // Typecast to ClassStrategy
                    this.actorClass = Paladin.getClassName();
                    Paladin.actorAbilities = actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
                    return Paladin.actorAbilities;
            case 8:
                    RangerStrategy Ranger = new RangerStrategy();
                    this.actorClassStrategy = (ClassStrategy) Ranger; // Typecast to ClassStrategy
                    this.actorClass = Ranger.getClassName();
                    Ranger.actorAbilities = actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
                    return Ranger.actorAbilities;
            case 9:
                    RogueStrategy Rogue = new RogueStrategy();
                    this.actorClassStrategy = (ClassStrategy) Rogue; // Typecast to ClassStrategy
                    this.actorClass = Rogue.getClassName();
                    Rogue.actorAbilities = actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
                    return Rogue.actorAbilities;
            case 10:
                    SorcererStrategy Sorcerer = new SorcererStrategy();
                    this.actorClassStrategy = (ClassStrategy) Sorcerer; // Typecast to ClassStrategy
                    this.actorClass = Sorcerer.getClassName();
                    Sorcerer.actorAbilities = actorClassStrategy.assignAttributes(characterMath.rollAttributes(6)); // Assign attributes
                    return Sorcerer.actorAbilities;
            case 11:
                    WarlockStrategy Warlock = new WarlockStrategy();
                    this.actorClassStrategy = (ClassStrategy) Warlock; // Typecast to ClassStrategy
                    this.actorClass = Warlock.getClassName();
                    Warlock.actorAbilities = actorClassStrategy.assignAttributes(characterMath.rollAttributes(6));
                    return Warlock.actorAbilities;
            case 12:
                    WizardStrategy Wizard = new WizardStrategy();
                    this.actorClassStrategy = (ClassStrategy) Wizard; // Typecast to ClassStrategy
                    this.actorClass = Wizard.getClassName();
                    Wizard.actorAbilities = actorClassStrategy.assignAttributes(characterMath.rollAttributes(6));
                    return Wizard.actorAbilities;
            default:
                System.out.println("Invalid Class ID");
                break;
        }
        return attributes;
    }    
}
