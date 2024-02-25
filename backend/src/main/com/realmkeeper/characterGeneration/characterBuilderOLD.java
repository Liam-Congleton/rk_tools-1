package com.realmkeeper.characterGeneration;
import com.realmkeeper.utils.diceSet;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class characterBuilderOLD 
{   
    public int ActorIdPrefix; // 1-12 or random val -1 initialize on creation
    public String ActorClass; // initialize on creation

    public void newActor()
    {
        getClassAttributes();
        System.out.println(ActorClass + " Attributes: \n" + AttributeToString(getClassAttributes()));
        System.out.println("Actor ID Prefix: " + ActorIdPrefix);
    }

    private void FormatAttributes(Map<String, Integer> map)
    {
     
    }

    private Map<String, Integer> getClassAttributes()
    {
        Map<String, Integer> attributes = new LinkedHashMap<>();
        if (this.ActorIdPrefix == 1) 
        {
            // Barbarian
            this.ActorClass = "Barbarian";
            String[] attributeNames = {"Charisma", "Intelligence", "Wisdom", "Dexterity", "Constitution", "Strength"};
            for (int i = 0; i < 6; i++) {
                attributes.put(attributeNames[i], rollAttributes()[i]);
            }
            return attributes;
        } else if (this.ActorIdPrefix == 2) {
            // Bard
            this.ActorClass = "Bard";
            String[] attributeNames = {"Strength", "Intelligence", "Wisdom", "Constitution", "Dexterity", "Charisma"};
            for (int i = 0; i < 6; i++) {
                attributes.put(attributeNames[i], rollAttributes()[i]);
            }
            return attributes;
        } else if (this.ActorIdPrefix == 3) {
            // Cleric
            this.ActorClass = "Cleric";
            String[] attributeNames = {"Charisma", "Intelligence", "Dexterity", "Strength", "Constitution", "Wisdom"};
            for (int i = 0; i < 6; i++) {
                attributes.put(attributeNames[i], rollAttributes()[i]);
            }
            return attributes;
        } else if (this.ActorIdPrefix == 4) {
                // Druid
                this.ActorClass = "Druid";
                String[] attributeNames = {"Charisma", "Strength", "Intelligence", "Dexterity", "Constitution", "Wisdom"};
                for (int i = 0; i < 6; i++) {
                    attributes.put(attributeNames[i], rollAttributes()[i]);
                }
                return attributes;
            }
            else if (this.ActorIdPrefix == 5) {
                // Fighter
                this.ActorClass = "Fighter";
                String[] attributeNames = {"Charisma", "Intelligence", "Wisdom", "Constitution", "Dexterity", "Strength"};
                for (int i = 0; i < 6; i++) {
                    attributes.put(attributeNames[i], rollAttributes()[i]);
                }
                return attributes;
            }
            else if (this.ActorIdPrefix == 6) {
                // Monk
                this.ActorClass = "Monk";
                String[] attributeNames = {"Charisma", "Intelligence", "Constitution", "Strength", "Wisdom", "Dexterity"};
                for (int i = 0; i < 6; i++) {
                    attributes.put(attributeNames[i], rollAttributes()[i]);
                }
                return attributes;
            }
            else if (this.ActorIdPrefix == 7) {
                // Paladin
                this.ActorClass = "Paladin";
                String[] attributeNames = {"Intelligence", "Dexterity", "Wisdom", "Constitution", "Charisma", "Strength"};
                for (int i = 0; i < 6; i++) {
                    attributes.put(attributeNames[i], rollAttributes()[i]);
                }
                return attributes;
            }
            else if (this.ActorIdPrefix == 8) {
                // Ranger
                this.ActorClass = "Ranger";
                String[] attributeNames = {"Charisma", "Intelligence", "Strength", "Constitution", "Wisdom", "Dexterity"};
                for (int i = 0; i < 6; i++) {
                    attributes.put(attributeNames[i], rollAttributes()[i]);
                }
                return attributes;
            }
            else if (this.ActorIdPrefix == 9) {
                // Rogue
                this.ActorClass = "Rogue";
                String[] attributeNames = {"Charisma", "Wisdom", "Strength", "Constitution", "Intelligence", "Dexterity"};
                for (int i = 0; i < 6; i++) {
                    attributes.put(attributeNames[i], rollAttributes()[i]);
                }
                return attributes;
            }
            else if (this.ActorIdPrefix == 10) {
                // Sorcerer
                this.ActorClass = "Sorcerer";
                String[] attributeNames = {"Strength", "Intelligence", "Wisdom", "Constitution", "Dexterity", "Charisma"};
                for (int i = 0; i < 6; i++) {
                    attributes.put(attributeNames[i], rollAttributes()[i]);
                }
                return attributes;
            }
            else if (this.ActorIdPrefix == 11) {
                // Warlock
                this.ActorClass = "Warlock";
                String[] attributeNames = {"Strength", "Intelligence", "Wisdom", "Constitution", "Dexterity", "Charisma"};
                for (int i = 0; i < 6; i++) {
                    attributes.put(attributeNames[i], rollAttributes()[i]);
                }
                return attributes;
            }
            else if (this.ActorIdPrefix == 12) {
                // Wizard
                this.ActorClass = "Wizard";
                String[] attributeNames = {"Strength", "Charisma", "Wisdom", "Constitution", "Dexterity", "Intelligence"};
                for (int i = 0; i < 6; i++) {
                    attributes.put(attributeNames[i], rollAttributes()[i]);
                }
            return attributes;
        }
        else
        {
            System.out.println("Invalid ActorIdPrefix");
            return null;
        }
    }

    private int[] rollAttributes()
    {
        diceSet newDiceSet = new diceSet();
        int[] rolls = new int[4];
        int[] attributesVal = new int[6];
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 4; i++) {
                rolls[i] = newDiceSet.rollD6();
            }
            Arrays.sort(rolls);
            attributesVal[j] = rolls[1] + rolls[2] + rolls[3];
        }
        
        Arrays.sort(attributesVal);
        return (attributesVal);
    }
  
    private String AttributeToString(Map<String, Integer> map)
    {
        String attributeString = "";
        for(String key : map.keySet())
        {
            attributeString += key + ": " + map.get(key) + "\n";
        }
        return attributeString;
    }
}
