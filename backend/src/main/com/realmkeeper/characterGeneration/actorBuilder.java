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
            // Assign attributes
            // case 3: // Cleric
            //     actorClass = "Cleric";
            //     priority = new int[]{2, 3, 4, 1, 5, 0}; // updated priority order for cleric: wisdom, constitution, dexterity, charisma, intelligence, strength
            //     for (int i = 0; i < 6; i++) 
            //     {
            //         attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
            //         //System.out.println(attributes[i] + " "); // Debugging
            //     }
            //     break;
            // case 4: // Druid
            //     actorClass = "Druid";
            //     priority = new int[]{2, 3, 4, 1, 5, 0}; // updated priority order for druid: wisdom, constitution, dexterity, strength, intelligence, charisma
            //     for (int i = 0; i < 6; i++) 
            //     {
            //         attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
            //         //System.out.println(attributes[i] + " "); // Debugging
            //     }
            //     break;
            // case 5: // Fighter
            //     actorClass = "Fighter";
            //     priority = new int[]{5, 4, 3, 0, 2, 1}; // updated priority order for fighter: strength, dexterity, constitution, wisdom, intelligence, charisma
            //     for (int i = 0; i < 6; i++) 
            //     {
            //         attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
            //         //System.out.println(attributes[i] + " "); // Debugging
            //     }
            //     break;
            // case 6: // Monk
            //     actorClass = "Monk";
            //     priority = new int[]{3, 5, 4, 0, 2, 1}; // updated priority order for monk: strength, constitution, dexterity, intelligence, wisdom, charisma
            //     for (int i = 0; i < 6; i++) 
            //     {
            //         attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
            //         //System.out.println(attributes[i] + " "); // Debugging
            //     }
            //     break;
            // case 7: // Paladin
            //     actorClass = "Paladin";
            //     priority = new int[]{4, 2, 3, 0, 1, 5}; // updated priority order for paladin: charisma, dexterity, constitution, intelligence, wisdom, strength
            //     for (int i = 0; i < 6; i++) 
            //     {
            //         attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
            //         //System.out.println(attributes[i] + " "); // Debugging
            //     }
            //     break;
            // case 8: // Ranger
            //     actorClass = "Ranger";
            //     priority = new int[]{3, 5, 3, 1, 4, 2}; // updated priority order for ranger: dexterity, charisma, constitution, intelligence, wisdom, strength
            //     for (int i = 0; i < 6; i++) 
            //     {
            //         attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
            //         //System.out.println(attributes[i] + " "); // Debugging
            //     }
            //     break;
            // case 9: // Rogue
            //     actorClass = "Rogue";
            //     priority = new int[]{1, 5, 3, 2, 0, 4}; // updated priority order for rogue: dexterity, charisma, constitution, wisdom, intelligence, strength
            //     for (int i = 0; i < 6; i++) 
            //     {
            //         attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
            //         //System.out.println(attributes[i] + " "); // Debugging
            //     }
            //     break;
            // case 10: // Sorcerer
            //     actorClass = "Sorcerer";
            //     priority = new int[]{0, 1, 3, 4, 2, 5}; // updated priority order for sorcerer: strength, dexterity, constitution, intelligence, wisdom, charisma
            //     for (int i = 0; i < 6; i++) 
            //     {
            //         attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
            //         //System.out.println(attributes[i] + " "); // Debugging
            //     }
            //     break;
            // case 11: // Warlock
            //     actorClass = "Warlock";
            //     priority = new int[]{0, 4, 3, 1, 2, 5}; // updated priority order for warlock: charisma, dexterity, constitution, intelligence, wisdom, strength
            //     for (int i = 0; i < 6; i++) 
            //     {
            //         attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
            //         //System.out.println(attributes[i] + " "); // Debugging
            //     }
            //     break;
            // case 12: // Wizard
            //     actorClass = "Wizard";
            //     priority = new int[]{0, 1, 4, 5, 3, 2}; // updated priority order for wizard: wisdom, constitution, dexterity, charisma, intelligence, strength
            //     for (int i = 0; i < 6; i++) 
            //     {
            //         attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
            //         //System.out.println(attributes[i] + " "); // Debugging
            //     }
            //     break;
            default:
                //priority = new int[]{5, 4, 3, 2, 1, 0}; // Default priority order
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
