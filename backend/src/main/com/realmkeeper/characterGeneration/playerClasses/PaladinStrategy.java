package com.realmkeeper.characterGeneration.playerClasses;

public class PaladinStrategy extends ClassStrategy
{

    public int[] actorAbilities = new int[6]; // Array to store actor abilities
    public int actorHealth; // Variable to store actor health
    public String actorClass = "Paladin"; // Variable to store actor class
    
    @Override
    public int [] assignAttributes(int [] rolledAttributes) 
    {
        int[] attributes = new int[6];
        attributes[0] = rolledAttributes[4]; // Strength
        attributes[1] = rolledAttributes[2]; // Dexterity
        attributes[2] = rolledAttributes[3]; // Constitution
        attributes[3] = rolledAttributes[1]; // Wisdom
        attributes[4] = rolledAttributes[0]; // Intelligence
        attributes[5] = rolledAttributes[5]; // Charisma
        
        return attributes; // Assign the rolled attributes to the actor
    }
    @Override
    public String getClassName()
    {
        return this.actorClass;
    }
    @Override
    public void assignHealth()
    {
        // Assign health to the actor
        // Health is calculated as 12 + constitution modifier
        // Constitution modifier is calculated as (constitution - 10) / 2
        int health = 12 + ((this.actorAbilities[2] - 10) / 2); 
        System.out.println("Health: " + health);
    }
    @Override
    public void debugActor() {
        
        throw new UnsupportedOperationException("Unimplemented method 'debugActor'");
    }
}
