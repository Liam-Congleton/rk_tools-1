package com.realmkeeper.characterGeneration.actorClasses;

import java.util.HashMap;

public class DruidStrategy extends ClassStrategy
{

    public int[] actorAbilities = new int[6]; // Array to store actor abilities
    public int actorHealth; // Variable to store actor health
    public String actorClass = "Druid"; // Variable to store actor class
    @Override
    protected double[] getCumulativeProbabilities() // TODO - update weights
    {
        return new double[] 
        {
            0.1, // LAWFUL_GOOD 
            0.45, // NEUTRAL_GOOD
            0.55, // CHAOTIC_GOOD
            0.65, // LAWFUL_NEUTRAL
            0.75, // TRUE_NEUTRAL
            0.85, // CHAOTIC_NEUTRAL
            0.90, // LAWFUL_EVIL
            0.95, // NEUTRAL_EVIL
            1.00  // CHAOTIC_EVIL
        };
    }    
    
    @Override
    public int [] assignAttributes(int [] rolledAttributes) 
    {
        actorAbilities[0] = rolledAttributes[0]; // Strength
        actorAbilities[1] = rolledAttributes[3]; // Dexterity
        actorAbilities[2] = rolledAttributes[4]; // Constitution
        actorAbilities[3] = rolledAttributes[5]; // Wisdom
        actorAbilities[4] = rolledAttributes[2]; // Intelligence
        actorAbilities[5] = rolledAttributes[1]; // Charisma
        
        return actorAbilities; // Assign the rolled attributes to the actor
    }
    @Override
    public int assignHealth()
    {
        int hitDie = 12;
        return this.actorHealth = (hitDie + getProficiency(2, this.actorAbilities));
    }
    @Override
    public String getClassName()
    {
        return this.actorClass;
    }
    @Override
    public HashMap<String, String> assignEquipment()
    {
        equipment.put("Armor", "Leather");
        equipment.put("Weapon", "Scimitar");
        equipment.put("Shield", "Wooden Shield");
        equipment.put("Gear", "Explorer's Pack");
        equipment.put("Tools", "Druidic Focus");
        equipment.put("Treasure", "10 Gold Pieces");
        equipment.put("Currency", "10 Gold Pieces");
        equipment.put("Notes", "None");
        equipment.put("Special", "None");
        return equipment;
    }
}
