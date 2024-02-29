package com.realmkeeper.characterGeneration;
import java.util.HashMap;

import com.realmkeeper.utils.DiceSet;

public class character extends actorBuilder
{
    private String ActorID;
    private int classID;
    private int raceID;
    private HashMap<String, String> actorEquipment = new HashMap<>();
    private int actorHealth;
    private String actorAlignment;
    protected int[] actorAbilities = new int[6]; // Array to store actor abilities
    protected int actorStr = actorAbilities[0];
    protected int actorDex = actorAbilities[1];
    protected int actorCon = actorAbilities[2];
    protected int actorInt = actorAbilities[3];
    protected int actorWis = actorAbilities[4];
    protected int actorCha = actorAbilities[5];
    // private String ActorName;
    // private String ActorRace;
    // private int ActorLevel;
    // private int ActorXP;
    // private int ActorHP;
    // private int ActorAC;
    // private int ActorInit;
    // public int ActorSpeed;
    // public int ActorHitDie;
    // public int ActorProficiency;
    // public int ActorInspiration;
    // public int ActorBackground;
    // public int ActorLanguages;
    // public int ActorEquipment;
    // public int ActorSpells;
    // public int ActorFeats;
    // public int ActorSkills;
    // public int ActorSaves;
    // public int ActorAbilities;
    // public int ActorAttacks;
    // public int ActorAmmo;
    // public int ActorArmor;
    // public int ActorWeapons;
    // public int ActorTools;
    // public int ActorGear;
    // public int ActorTreasure;
    // public int ActorCurrency;
    // public int ActorNotes;
    // public int ActorImage;
    // public int ActorPortrait;
    // public int ActorToken;
    // public int ActorMap;
    // public int ActorCampaign;
    // public int ActorParty;
    // public int ActorFaction;
    // public int ActorGuild;
    // public int ActorClan;
    // public int ActorRaceTraits;
    // public int ActorClassTraits;
    // public int ActorBackgroundTraits;
    // public int ActorFeatTraits;
    // public int ActorSpellTraits;
    // public int ActorAbilityTraits;
    // public int ActorAttackTraits;
    // public int ActorSkillTraits;
    // public int ActorSaveTraits;
    // public int ActorAbilityScores;
    // public int ActorAbilityMods;
    // public int ActorAbilitySaves;
    // public int ActorSkillMods;
    // public int ActorSaveMods;
    // public int ActorAttackMods;
    // public int ActorSpellDC;
    // public int ActorSpellAttack;
    // public int ActorSpellSlots;
    // public int ActorSpellPrepared;
    // public int ActorSpellCasting;
    // public int ActorSpellSchool;
    // public int ActorSpellComponents;
    // public int ActorSpellDuration;
    // public int ActorSpellRange;
    // public int ActorSpellArea;
    // public int ActorSpellEffect;
    // public int ActorSpellTarget;
    // public int ActorSpellSave;
    // public int ActorSpellDamage;
    // public int ActorSpellHealing;

    public character(String actorID)
    {
        DiceSet dice = new DiceSet();

     if(actorID == null)
     {
        System.out.println("ActorId cannot be null");
        System.exit(0);
     }
     else if(actorID == "")
     {
        System.out.println("ActorId cannot be empty");
        System.exit(0);
     }
     else if (actorID.charAt(actorID.length() - 1) == 'R') // ++ Random Actor Generation ++
      {
        //this.classId = 1; // Default to Barbarian temporarily
        classID = dice.rollD12(); //ID LOGIC BEGIN - Random classID
        this.raceID = 1;
        
        setAttributes();

        setHealth(); // Assign health
        setAlignment(); // Assign alignment
        setEquipment(); // Assign equipment
                if(this.classID < 10)  
                {
                    this.ActorID = actorID + "0" + classID + "c";    
                }
                else
                     {
                    this.ActorID = actorID + classID + "c";
                }
      } 
      else
      {
          System.out.println("[PLACEHOLDER] ActorId must end with 'R' for random actor generation. This branch is for deliberate actor generation.");
      }
     }
    private void setAttributes() 
    {
        actorAbilities = assignActorClass(actorAbilities, this.classID, 1); // Random level 1 class

        for (int i = 0; i < actorAbilities.length; i++)  // Ensure no ability is below 8
        {
            if (actorAbilities[i] < 8) 
            {
                actorAbilities[i] = 8;
            }
        }
        actorStr = actorAbilities[0]; 
        actorDex = actorAbilities[1];
        actorCon = actorAbilities[2];
        actorInt = actorAbilities[3];
        actorWis = actorAbilities[4];
        actorCha = actorAbilities[5];
    }
    private void setRace(int raceID)
    {
        assignActorRace(actorAbilities, raceID);
        
    }
    private void setAlignment()
    {
        actorAlignment = actorClassStrategy.assignAlignment();
    }
    private void setHealth()
    {
        actorHealth = actorClassStrategy.assignHealth();
    }
    private void setEquipment()
    {
        actorEquipment = actorClassStrategy.assignEquipment();

    }
    public void debugActor()
    {
        System.out.println("DEBUG LOG FOR ActorId:" + this.ActorID); //OK
        System.out.println("Actor Attributes:");
        System.out.println("Class: " + this.actorClassName); //OK
        System.out.println("Health: " + this.actorHealth); //OK
        System.out.println("Strength: " + this.actorStr); //OK
        System.out.println("Dexterity: " + this.actorDex); //OK
        System.out.println("Constitution: " + this.actorCon); //OK
        System.out.println("Intelligence: " + this.actorInt); //OK
        System.out.println("Wisdom: " + this.actorWis); //OK
        System.out.println("Charisma: " + this.actorCha); //OK
        System.out.println("Alignment: " + this.actorAlignment); //OK
        System.out.println("Equipment: " + this.actorEquipment); //OK
    }
}
