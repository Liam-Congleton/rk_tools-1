package com.realmkeeper.characterGeneration;
import com.realmkeeper.utils.DiceSet;

public class character extends actorBuilder
{
    private String ActorId;
    private int classId;
    protected int[] actorAbilities = new int[6]; // Array to store actor abilities
    protected int actorStr = actorAbilities[0];
    protected int actorDex = actorAbilities[1];
    protected int actorCon = actorAbilities[2];
    protected int actorInt = actorAbilities[3];
    protected int actorWis = actorAbilities[4];
    protected int actorCha = actorAbilities[5];
    private int actorHealth;
    //ClassStrategy x;
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
    // public int ActorAlignment;
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

    public character(String actorId)
    {
        DiceSet dice = new DiceSet();

     if(actorId == null)
     {
        System.out.println("ActorId cannot be null");
        System.exit(0);
     }
     else if(actorId == "")
     {
        System.out.println("ActorId cannot be empty");
        System.exit(0);
     }
     else if (actorId.charAt(actorId.length() - 1) == 'R') // ++ Random Actor Generation ++
      {
        //this.classId = 1; // Default to Barbarian temporarily
        this.classId = dice.rollD12();  
        setCharacterAttributes();

                if(this.classId < 10)  
                {
                    this.ActorId = actorId + "0" + classId + "c";    
                }
                else
                     {
                    this.ActorId = actorId + classId + "c";
                }
      } 
      else
      {
          System.out.println("[PLACEHOLDER] ActorId must end with 'R' for random actor generation. This branch is for deliberate actor generation.");
      }
     }
    private void setCharacterAttributes() 
    {
        System.out.println("GENERATING NEW RANDOM ACTOR_ID: " + this.classId);
        actorAbilities = assignActorClass(actorAbilities, this.classId, 1); // Random level 1 class
        
        // Ensure actor abilities are not below 8
        for (int i = 0; i < actorAbilities.length; i++) 
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
        actorHealth = actorClassStrategy.assignHealth();
    }
    public void debugActor()
    {
        System.out.println("DEBUG LOG FOR ActorId:" + this.ActorId); //OK
        System.out.println("Actor Attributes:");
        System.out.println("Class: " + this.actorClass);
        System.out.println("Health: " + this.actorHealth);
        System.out.println("Strength: " + this.actorStr);
        System.out.println("Dexterity: " + this.actorDex);
        System.out.println("Constitution: " + this.actorCon);
        System.out.println("Intelligence: " + this.actorInt);
        System.out.println("Wisdom: " + this.actorWis);
        System.out.println("Charisma: " + this.actorCha);

    }
    // private void showActorSimple()
    // {
    //     //print all actor attributes
        
    // }
}
