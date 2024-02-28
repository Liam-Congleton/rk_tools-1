package com.realmkeeper.characterGeneration.playerClasses;

public class BarbarianStrategy extends ClassStrategy
 {
    public int[] actorAbilities = new int[6]; // Array to store actor abilities
    public int actorHealth; // Variable to store actor health
    public String actorClass = "Barbarian"; // Variable to store actor class
    
    @Override
    public int[] assignAttributes(int[] rolledAttributes) 
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
        int health = 12 + ((this.actorAbilities[2] - 10) / 2); // TODO: Add a check for negative constitution modifier, and add a minimum health of 1
        System.out.println("Health: " + health);
    }
    
    // @Override
    // public int[] assignSkills() {
    //     throw new UnsupportedOperationException("Unimplemented method 'assignSkills'");
    // }

    // @Override
    // public int[] assignSaves() {
    //     throw new UnsupportedOperationException("Unimplemented method 'assignSaves'");
    // }

    // @Override
    // public int[] assignProficiencies() {
    //     throw new UnsupportedOperationException("Unimplemented method 'assignProficiencies'");
    // }

    // @Override
    // public int[] assignEquipment() {
    //     throw new UnsupportedOperationException("Unimplemented method 'assignEquipment'");
    // }

    // @Override
    // public int[] assignSpells() {
    //     throw new UnsupportedOperationException("Unimplemented method 'assignSpells'");
    // }

    // @Override
    // public int[] assignFeats() {
    //     throw new UnsupportedOperationException("Unimplemented method 'assignFeats'");
    // }

    // @Override
    // public int[] assignTraits() {
    //     throw new UnsupportedOperationException("Unimplemented method 'assignTraits'");
    // }

    // @Override
    // public int[] assignAttacks() {
    //     throw new UnsupportedOperationException("Unimplemented method 'assignAttacks'");
    // }

    // @Override
    // public int[] assignAmmo() {
    //     throw new UnsupportedOperationException("Unimplemented method 'assignAmmo'");
    // }

    // @Override
    // public int[] assignArmor() {
    //     throw new UnsupportedOperationException("Unimplemented method 'assignArmor'");
    // }

    // @Override
    // public int[] assignWeapons() {
    //     throw new UnsupportedOperationException("Unimplemented method 'assignWeapons'");
    // }

    // @Override
    // public int[] assignTools() {
    //     throw new UnsupportedOperationException("Unimplemented method 'assignTools'");
    // }

    // @Override
    // public int[] assignGear() {
    //     throw new UnsupportedOperationException("Unimplemented method 'assignGear'");
    // }

    // @Override
    // public int[] assignTreasure() {
    //     throw new UnsupportedOperationException("Unimplemented method 'assignTreasure'");
    // }

    // @Override
    // public int[] assignCurrency() {
    //     throw new UnsupportedOperationException("Unimplemented method 'assignCurrency'");
    // }

    // @Override
    // public int[] assignNotes() {
    //     throw new UnsupportedOperationException("Unimplemented method 'assignNotes'");
    // }

    // @Override
    // public int[] assignImage() {
    //     throw new UnsupportedOperationException("Unimplemented method 'assignImage'");
    // }

    // @Override
    // public int[] assignPortrait() {
    //     throw new UnsupportedOperationException("Unimplemented method 'assignPortrait'");
    // }

    // @Override
    // public int[] assignToken() {
    //     
    //     throw new UnsupportedOperationException("Unimplemented method 'assignToken'");
    // }
    @Override
    public void debugActor()
    {
        //print all actor data
        for (int i = 0; i < 6; i++)
        {
            System.out.println("Attribute " + i + ": " + this.actorAbilities[i]);
        }
    }
}