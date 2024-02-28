package com.realmkeeper.characterGeneration.playerClasses;
import java.util.HashMap;
import java.util.Random;

public class ClassStrategy 
{
    public int[] actorAbilities;
    public int actorHealth;
    public String ActorId;
    private String actorClass;
    private static final Random RANDOM = new Random(); // Cache the random number generator
    private static final Alignment[] ALIGNMENTS = Alignment.values(); // Cache the values array

    public int[] assignAttributes(int [] rolledAttributes)
    {
        return rolledAttributes; 
    }
    public int assignHealth()
    {
        int hitDie = -1000000; // Placeholder
        
        return actorHealth = (hitDie + getProficiency(2, this.actorAbilities));
    }
    public String getClassName()
    {
        return this.actorClass;
    }
    public int getProficiency(int attributeSelect, int[] attributes)
    {
        this.actorAbilities = attributes;
        return ((this.actorAbilities[attributeSelect] - 10) / 2);
    }
    public enum Alignment  // Enum for character alignments
    {
        LAWFUL_GOOD, NEUTRAL_GOOD, CHAOTIC_GOOD,
        LAWFUL_NEUTRAL, TRUE_NEUTRAL, CHAOTIC_NEUTRAL,
        LAWFUL_EVIL, NEUTRAL_EVIL, CHAOTIC_EVIL;
    }
    protected double[] getCumulativeProbabilities() 
    {
        return new double[] {
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
    public Alignment getRandomWeightedAlignment() {
        double[] cumulativeProbabilities = getCumulativeProbabilities(); // Get the cumulative probabilities
        double randomValue = RANDOM.nextDouble(); // Random value between 0.0 and 1.0

        for (int i = 0; i < cumulativeProbabilities.length; i++) {
            if (randomValue < cumulativeProbabilities[i]) {
                return ALIGNMENTS[i]; // Return the alignment at the current index
            }
        }

        return ALIGNMENTS[ALIGNMENTS.length - 1]; // Fallback, should not happen
    }
    public void assignAlignment()  // Assign a random alignment to the character  
    {
        Alignment randomWeightedAlignment = getRandomWeightedAlignment(); // Random weights overidden by subclass
        System.out.println("The character's alignment is: " + randomWeightedAlignment);
    }
    public HashMap<String, String> assignEquipment() 
    {
        HashMap<String, String> equipment = new HashMap<>();
        // Add equipment items to the HashMap
        equipment.put("Weapon", "Sword");
        equipment.put("Armor", "Shield");
        equipment.put("Accessory", "Ring");
        return equipment;
    }
    public void debugActor()
    {

    }
}

    // public int[] assignSkills();
    // public int[] assignSaves();
    // public int[] assignProficiencies();
    // public int[] assignSpells();
    // public int[] assignFeats();
    // public int[] assignTraits();
    // public int[] assignAttacks();
    // public int[] assignAmmo();
    // public int[] assignArmor();
    // public int[] assignWeapons();
    // public int[] assignTools();
    // public int[] assignGear();
    // public int[] assignTreasure();
    // public int[] assignCurrency();
    // public int[] assignNotes();
    // public int[] assignImage();
    // public int[] assignPortrait();
    // public int[] assignToken();
