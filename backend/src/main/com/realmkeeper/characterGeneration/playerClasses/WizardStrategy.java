package com.realmkeeper.characterGeneration.playerClasses;

public class WizardStrategy implements ClassStrategy
{

    public int[] actorAbilities = new int[6]; // Array to store actor abilities
    public int actorHealth; // Variable to store actor health
    public String actorClass = "Wizard"; // Variable to store actor class
    
    @Override
    public int [] assignAttributes(int [] rolledAttributes) 
    {
        int[] attributes = new int[6];
        attributes[0] = rolledAttributes[5]; // Strength
        attributes[1] = rolledAttributes[3]; // Dexterity
        attributes[2] = rolledAttributes[4]; // Constitution
        attributes[3] = rolledAttributes[2]; // Wisdom
        attributes[4] = rolledAttributes[0]; // Intelligence
        attributes[5] = rolledAttributes[1]; // Charisma
        
        return attributes; // Assign the rolled attributes to the actor
    }
    @Override
    public void assignHealth()
    {
        // Assign health to the actor
        // Health is calculated as 12 + constitution modifier
        // Constitution modifier is calculated as (constitution - 10) / 2
        int health = 12 + ((this.actorAbilities[2] - 10) / 2); // TODO: Add a check for negative constitution modifier, and add a minimum health of 1
        System.out.println("Health: " + health);
    }
    @Override
    public void debugActor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'debugActor'");
    }
    
}
