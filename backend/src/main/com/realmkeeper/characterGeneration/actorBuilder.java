package com.realmkeeper.characterGeneration;

import java.util.Arrays;
import com.realmkeeper.utils.diceSet;

public class actorBuilder
{
    public String ActorId; 
    
    protected int[] rollAttributes(int amount)
    {
        diceSet newDiceSet = new diceSet();
        int[] rolls = new int[4];
        int[] attributesVal = new int[amount];
        for (int j = 0; j < amount; j++) {
            for (int i = 0; i < 4; i++) {
                rolls[i] = newDiceSet.rollD6();
            }
            Arrays.sort(rolls);
            attributesVal[j] = (rolls[1] + rolls[2] + rolls[3]);
        }
        Arrays.sort(attributesVal);
        for (int i = 0; i < amount; i++) {
            //System.out.println(attributesVal[i] + " "); // Debugging
        }
        return (attributesVal);
    }
    
    protected int[] allocateAttributesByPriority(int[] attributes, int classId) {
        
        int[] priority;
        int[] rolledAttributes = rollAttributes(6);
        switch (classId) 
        {
            case 1: //Barbarian
                priority = new int[]{5, 4, 3, 0, 2, 1}; // updated priority order for barbarian: strength, dexterity, constitution, wisdom, intelligence, charisma
                for (int i = 0; i < 6; i++) 
                {
                    attributes[i] = rolledAttributes[priority[i]]; //assign rolled attributes in the priority order (ascending)
                    //System.out.println(attributes[i] + " "); // Debugging
                }
                break;
                case 2: // Bard
                priority = new int[]{0, 1, 3, 2, 4, 5}; // updated priority order for bard: charisma, dexterity, constitution, wisdom, intelligence, strength
                for (int i = 0; i < 6; i++) 
                {
                    attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
                    //System.out.println(attributes[i] + " "); // Debugging
                }
                break;
            case 3: // Cleric
                priority = new int[]{4, 3, 2, 5, 1, 0}; // updated priority order for cleric: wisdom, constitution, dexterity, charisma, intelligence, strength
                for (int i = 0; i < 6; i++) 
                {
                    attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
                    //System.out.println(attributes[i] + " "); // Debugging
                }
                break;
            case 4: // Druid
                priority = new int[]{3, 2, 4, 5, 1, 0}; // updated priority order for druid: constitution, dexterity, intelligence, charisma, wisdom, strength
                for (int i = 0; i < 6; i++) 
                {
                    attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
                    //System.out.println(attributes[i] + " "); // Debugging
                }
                break;
            case 5: // Fighter
                priority = new int[]{5, 4, 3, 0, 2, 1}; // updated priority order for fighter: strength, dexterity, constitution, wisdom, intelligence, charisma
                for (int i = 0; i < 6; i++) 
                {
                    attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
                    //System.out.println(attributes[i] + " "); // Debugging
                }
                break;
            case 6: // Monk
                priority = new int[]{0, 2, 3, 4, 1, 5}; // updated priority order for monk: strength, constitution, dexterity, intelligence, wisdom, charisma
                for (int i = 0; i < 6; i++) 
                {
                    attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
                    //System.out.println(attributes[i] + " "); // Debugging
                }
                break;
            case 7: // Paladin
                priority = new int[]{5, 1, 3, 4, 2, 0}; // updated priority order for paladin: charisma, dexterity, constitution, intelligence, wisdom, strength
                for (int i = 0; i < 6; i++) 
                {
                    attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
                    //System.out.println(attributes[i] + " "); // Debugging
                }
                break;
            case 8: // Ranger
                priority = new int[]{2, 5, 3, 4, 1, 0}; // updated priority order for ranger: dexterity, charisma, constitution, intelligence, wisdom, strength
                for (int i = 0; i < 6; i++) 
                {
                    attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
                    //System.out.println(attributes[i] + " "); // Debugging
                }
                break;
            case 9: // Rogue
                priority = new int[]{1, 5, 3, 2, 4, 0}; // updated priority order for rogue: dexterity, charisma, constitution, wisdom, intelligence, strength
                for (int i = 0; i < 6; i++) 
                {
                    attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
                    //System.out.println(attributes[i] + " "); // Debugging
                }
                break;
            case 10: // Sorcerer
                priority = new int[]{0, 1, 3, 4, 2, 5}; // updated priority order for sorcerer: strength, dexterity, constitution, intelligence, wisdom, charisma
                for (int i = 0; i < 6; i++) 
                {
                    attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
                    //System.out.println(attributes[i] + " "); // Debugging
                }
                break;
            case 11: // Warlock
                priority = new int[]{5, 1, 3, 4, 2, 0}; // updated priority order for warlock: charisma, dexterity, constitution, intelligence, wisdom, strength
                for (int i = 0; i < 6; i++) 
                {
                    attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
                    //System.out.println(attributes[i] + " "); // Debugging
                }
                break;
            case 12: // Wizard
                priority = new int[]{4, 3, 2, 5, 1, 0}; // updated priority order for wizard: wisdom, constitution, dexterity, charisma, intelligence, strength
                for (int i = 0; i < 6; i++) 
                {
                    attributes[i] = rolledAttributes[priority[i]]; // assign rolled attributes in the priority order (ascending)
                    //System.out.println(attributes[i] + " "); // Debugging
                }
                break;
            default:
                priority = new int[]{5, 4, 3, 2, 1, 0}; // Default priority order
                break;
        }

        return attributes;
    }
}
