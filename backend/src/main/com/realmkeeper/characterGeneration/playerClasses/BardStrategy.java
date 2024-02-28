package com.realmkeeper.characterGeneration.playerClasses;

public class BardStrategy extends ClassStrategy
{

    public int[] actorAbilities = new int[6]; // Array to store actor abilities
    public int actorHealth; // Variable to store actor health
    public String actorClass = "Bard"; // Variable to store actor class
    
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
    public void assignHealth()
    {
        // Assign health to the actor
        // Health is calculated as 12 + constitution modifier
        // Constitution modifier is calculated as (constitution - 10) / 2
        actorHealth = 12 + getProficiency(2, actorAbilities);
    }
}
