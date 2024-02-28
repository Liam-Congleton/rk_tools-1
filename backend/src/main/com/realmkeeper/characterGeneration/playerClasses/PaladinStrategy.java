package com.realmkeeper.characterGeneration.playerClasses;

public class PaladinStrategy extends ClassStrategy
{

    public int[] actorAbilities = new int[6]; // Array to store actor abilities
    public int actorHealth; // Variable to store actor health
    public String actorClass = "Paladin"; // Variable to store actor class
    
    @Override
    public int [] assignAttributes(int [] rolledAttributes) 
    {
        actorAbilities[0] = rolledAttributes[4]; // Strength
        actorAbilities[1] = rolledAttributes[2]; // Dexterity
        actorAbilities[2] = rolledAttributes[3]; // Constitution
        actorAbilities[3] = rolledAttributes[1]; // Wisdom
        actorAbilities[4] = rolledAttributes[0]; // Intelligence
        actorAbilities[5] = rolledAttributes[5]; // Charisma
        
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
        int hitDie = 12;
        return this.actorHealth = (hitDie + getProficiency(2, this.actorAbilities));
    }
    @Override
    public void debugActor() {
        
        throw new UnsupportedOperationException("Unimplemented method 'debugActor'");
    }
}
