package com.realmkeeper.characterGeneration.actorClasses;

import java.util.HashMap;

public class BardStrategy extends ClassStrategy
{

    public int[] actorAbilities = new int[6]; // Array to store actor abilities
    public int actorHealth; // Variable to store actor health
    private String actorClass = "Bards"; // Variable to store actor class
    
    @Override
    protected double[] getCumulativeProbabilities() // TODO - update weights
    {
        return new double[] 
        {
            0.1, // LAWFUL_GOOD
            0.25, // NEUTRAL_GOOD
            0.45, // CHAOTIC_GOOD
            0.55, // LAWFUL_NEUTRAL
            0.65, // TRUE_NEUTRAL
            0.80, // CHAOTIC_NEUTRAL
            0.85, // LAWFUL_EVIL
            0.92, // NEUTRAL_EVIL
            1.00  // CHAOTIC_EVIL
        };
    }    
    @Override
    public int [] assignAttributes(int [] rolledAttributes) 
    {
        this.actorAbilities[0] = rolledAttributes[0]; // Strength
        this.actorAbilities[1] = rolledAttributes[4]; // Dexterity
        this.actorAbilities[2] = rolledAttributes[3]; // Constitution
        this.actorAbilities[3] = rolledAttributes[2]; // Wisdom
        this.actorAbilities[4] = rolledAttributes[1]; // Intelligence
        this.actorAbilities[5] = rolledAttributes[5]; // Charisma
        
        return this.actorAbilities; // Assign the rolled attributes to the actor
    }
    @Override
    public String getClassName()
    {
        return this.actorClass;
    }
    @Override
    public int assignHealth()
    {
        int hitDie = 8;
        return this.actorHealth = (hitDie + getProficiency(2, this.actorAbilities));
    }
    @Override
    public HashMap<String, String> assignEquipment()
    {
        equipment.put("Armor", "Leather");
        equipment.put("Weapon", "Dagger");
        equipment.put("Shield", "None");
        equipment.put("Gear", "Entertainer's Pack");
        equipment.put("Tools", "Lute");
        equipment.put("Treasure", "15 Gold Pieces");
        equipment.put("Currency", "15 Gold Pieces");
        equipment.put("Notes", "None");
        equipment.put("Special", "None");
        return equipment;
    }
}
