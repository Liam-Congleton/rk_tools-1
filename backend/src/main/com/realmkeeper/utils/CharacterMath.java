package com.realmkeeper.utils;
import java.util.Arrays;

public class CharacterMath extends DiceSet
{
    public int[] rollAttributes(int amount) //Generate the attributes for the character
    {
        int[] rolls = new int[4]; // Array to store the 4 rolls
        int[] attributesVal = new int[amount]; // Array to store the sum of the highest 3 rolls
        for (int j = 0; j < amount; j++) { // Roll 4d6 and sum the highest 3 rolls
            for (int i = 0; i < 4; i++) {
                rolls[i] = rollD6();
            }
            Arrays.sort(rolls); // Sort the rolls in ascending order
            attributesVal[j] = (rolls[1] + rolls[2] + rolls[3]); // Sum the highest 3 rolls
        }
        Arrays.sort(attributesVal); 
        return (attributesVal); 
    }
}