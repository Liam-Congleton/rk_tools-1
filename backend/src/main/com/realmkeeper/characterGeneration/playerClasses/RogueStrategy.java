package com.realmkeeper.characterGeneration.playerClasses;

public class RogueStrategy extends ClassStrategy
{

    public int[] actorAbilities = new int[6]; // Array to store actor abilities
    public int actorHealth; // Variable to store actor health
    public String actorClass = "Rogue"; // Variable to store actor class
    
    @Override
    public int [] assignAttributes(int [] rolledAttributes) 
    {
        actorAbilities[0] = rolledAttributes[0]; // Strength
        actorAbilities[1] = rolledAttributes[5]; // Dexterity
        actorAbilities[2] = rolledAttributes[3]; // Constitution
        actorAbilities[3] = rolledAttributes[4]; // Wisdom
        actorAbilities[4] = rolledAttributes[2]; // Intelligence
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
        actorHealth = 12 + getProficiency(2, this.actorAbilities);
    }
    @Override
    public void debugActor() {
        throw new UnsupportedOperationException("Unimplemented method 'debugActor'");
    }
}
