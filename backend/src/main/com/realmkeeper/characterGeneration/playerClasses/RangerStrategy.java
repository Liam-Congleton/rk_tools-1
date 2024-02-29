package com.realmkeeper.characterGeneration.playerClasses;

import java.util.HashMap;

public class RangerStrategy extends ClassStrategy
{

    public int[] actorAbilities = new int[6]; // Array to store actor abilities
    public int actorHealth; // Variable to store actor health
    public String actorClass = "Ranger"; // Variable to store actor class
    @Override
    protected double[] getCumulativeProbabilities() // TODO - update weights
    {
        return new double[] 
        {
            0.3, // LAWFUL_GOOD 
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
        actorAbilities[0] = rolledAttributes[2]; // Strength
        actorAbilities[1] = rolledAttributes[5]; // Dexterity
        actorAbilities[2] = rolledAttributes[3]; // Constitution
        actorAbilities[3] = rolledAttributes[4]; // Wisdom
        actorAbilities[4] = rolledAttributes[0]; // Intelligence
        actorAbilities[5] = rolledAttributes[1]; // Charisma
        
        return actorAbilities; // Assign the rolled attributes to the actor
    }
    @Override
    public String getClassName()
    {
        return this.actorClass;
    }
    @Override
    public int assignHealth()
    {
        int hitDie = 6;
        return this.actorHealth = (hitDie + getProficiency(2, this.actorAbilities));
    }
<<<<<<< HEAD
    @Override
    public HashMap<String, String> assignEquipment()
    {
        equipment.put("Armor", "Leather");
        equipment.put("Weapon", "Longbow");
        equipment.put("Shield", "None");
        equipment.put("Gear", "Dungeoneer's Pack");
        equipment.put("Tools", "None");
        equipment.put("Treasure", "15 Gold Pieces");
        equipment.put("Currency", "15 Gold Pieces");
        equipment.put("Notes", "None");
        equipment.put("Special", "None");
        return equipment;
    }
=======
>>>>>>> 6cfaaaa697e1b964bbcc2f898ba8215810870f0b
}
