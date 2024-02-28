package com.realmkeeper.characterGeneration.playerClasses;

public class BarbarianStrategy extends ClassStrategy
 {
    public int[] actorAbilities = new int[6]; // Array to store actor abilities
    public int actorHealth; // Variable to store actor health
    public String actorClass = "Barbarian"; // Variable to store actor class
    
    @Override
    protected double[] getCumulativeProbabilities() 
    {
        return new double[] 
        {
            0.05, // LAWFUL_GOOD 
            0.1,  // NEUTRAL_GOOD
            0.15, // CHAOTIC_GOOD
            0.2,  // LAWFUL_NEUTRAL
            0.25, // TRUE_NEUTRAL
            0.75, // CHAOTIC_NEUTRAL
            0.8,  // LAWFUL_EVIL
            0.9,  // NEUTRAL_EVIL
            1.0   // CHAOTIC_EVIL
        };
    }
    @Override
    public int[] assignAttributes(int[] rolledAttributes) 
    {
        
        actorAbilities[0] = rolledAttributes[5]; // Strength
        actorAbilities[1] = rolledAttributes[3]; // Dexterity
        actorAbilities[2] = rolledAttributes[4]; // Constitution
        actorAbilities[3] = rolledAttributes[2]; // Wisdom
        actorAbilities[4] = rolledAttributes[0]; // Intelligence
        actorAbilities[5] = rolledAttributes[1]; // Charisma
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
        int hitDie = 12;
        return this.actorHealth = (hitDie + getProficiency(2, this.actorAbilities));
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