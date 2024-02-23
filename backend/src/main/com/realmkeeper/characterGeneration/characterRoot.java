package com.realmkeeper.characterGeneration;
import com.realmkeeper.utils.diceSet;
import java.util.Arrays;
import java.util.HashMap;

public class characterRoot 
{   
    private int ActorIdPrefix;

    public void newActor(int ActorIdPrefix)
    {
        getActorClass(this.ActorIdPrefix);
        getAttributes();
        
    }
    private void getActorClass(int classID)
    {
        switch(classID) {
            case 1:
                System.out.println("You have selected the Barbarian class.");
                break;
            case 2:
                System.out.println("You have selected the Bard class.");
                break;
            case 3:
                System.out.println("You have selected the Cleric class.");
                break;
            case 4:
                System.out.println("You have selected the Druid class.");
                break;
            case 5:
                System.out.println("You have selected the Fighter class.");
                break;
            case 6:
                System.out.println("You have selected the Monk class.");
                break;
            case 7:
                System.out.println("You have selected the Paladin class.");
                break;
            case 8:
                System.out.println("You have selected the Ranger class.");
                break;
            case 9:
                System.out.println("You have selected the Rogue class.");
                break;
            case 10:
                System.out.println("You have selected the Sorcerer class.");
                break;
            case 11:
                System.out.println("You have selected the Warlock class.");
                break;
            case 12:
                System.out.println("You have selected the Wizard class.");
                break;
            default:
                System.out.println("Invalid selection. Please select a valid class.");
                break;
        }   
    }   
    
    private HashMap<String, Integer> getAttributes()
    {
        HashMap<String, Integer> attributes = new HashMap<>();
        for(int i = 0; i < 5; i++)
        {
            attributes.put("Attribute " + i, rollAttributes());
        }
        return attributes;
    }

    private int rollAttributes()
    {
        diceSet newDiceSet = new diceSet();
        Integer[] rolls = new Integer[3];
        for(int i = 0; i < 3; i++)
        {
            rolls[i] = newDiceSet.rollD6();
        }
        Arrays.sort(rolls);
        return rolls[0] + rolls[1] + rolls[3];
    }
}
