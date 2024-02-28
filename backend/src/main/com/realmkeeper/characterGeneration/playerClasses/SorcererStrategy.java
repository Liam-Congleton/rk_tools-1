package com.realmkeeper.characterGeneration.playerClasses;

public class SorcererStrategy extends ClassStrategy
{

    public int[] actorAbilities = new int[6]; // Array to store actor abilities
    public int actorHealth; // Variable to store actor health
    public String actorClass = "Sorcerer"; // Variable to store actor class
    
    @Override
    public int [] assignAttributes(int [] rolledAttributes) 
    {
        actorAbilities[0] = rolledAttributes[5]; // Strength
        actorAbilities[1] = rolledAttributes[3]; // Dexterity
        actorAbilities[2] = rolledAttributes[4]; // Constitution
        actorAbilities[3] = rolledAttributes[2]; // Wisdom
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
