package com.realmkeeper.characterGeneration;

import com.realmkeeper.characterGeneration.playerClasses.*;
import java.util.Arrays;
import com.realmkeeper.utils.DiceSet;

public class actorBuilder
{
    public String ActorId; 
    public String actorClass;
    public ClassStrategy actorClassStrategy;
    
    // protected int[] rollAttributes(int amount)
    // {
    //     diceSet dice = new diceSet();
    //     int[] rolls = new int[4]; // Array to store the 4 rolls
    //     int[] attributesVal = new int[amount]; // Array to store the sum of the highest 3 rolls
    //     for (int j = 0; j < amount; j++) { // Roll 4d6 and sum the highest 3 rolls
    //         for (int i = 0; i < 4; i++) {
    //             rolls[i] = dice.rollD6();
    //         }
    //         Arrays.sort(rolls); // Sort the rolls in ascending order
    //         attributesVal[j] = (rolls[1] + rolls[2] + rolls[3]); // Sum the highest 3 rolls
    //     }
    //     Arrays.sort(attributesVal); 
    //     return (attributesVal); 
    // }
    protected int[] assignActorClass(int[] attributes, int classId, int actorLevel) //Default to Barbarian lvl 1
    {
        switch (classId) 
        {
            case 1: //Barbarian
                    actorClass = "Barbarian";
                    BarbarianStrategy barbarian = new BarbarianStrategy();
                    this.actorClassStrategy = (ClassStrategy) barbarian; // Typecast to ClassStrategy
                    attributes = actorClassStrategy.assignAttributes(rollAttributes(6));
                    break;
                
            //     case 2: // Bard
            //     actorClass = "Bard";
            //     priority = new int[]{0, 4, 3, 1, 2, 5}; // updated priority order for bard: charisma, dexterity, constitution, wisdom, intelligence, strength
            //     for (int i = 0; i < 6; i++) 
            //     {
            //         attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
            //         //System.out.println(attributes[i] + " "); // Debugging
            //     }
            //     break;
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
