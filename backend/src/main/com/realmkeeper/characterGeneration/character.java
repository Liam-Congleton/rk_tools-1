package com.realmkeeper.characterGeneration;

import com.realmkeeper.utils.diceSet;

public class character extends actorBuilder
{
    private String ActorId;
    private String ActorName;
    private String ActorRace;
    private String ActorClass;
    private int ActorLevel;
    private int ActorXP;
    private int ActorHP;
    private int ActorAC;
    protected int[] actorAbilities = new int[6]; // Array to store actor abilities
    protected int actorStr = actorAbilities[0];
    protected int actorDex = actorAbilities[1];
    protected int actorCon = actorAbilities[2];
    protected int actorInt = actorAbilities[3];
    protected int actorWis = actorAbilities[4];
    protected int actorCha = actorAbilities[5];
    //private int ActorInit;
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
        diceSet diceSet = new diceSet();

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
     else if (actorId.charAt(actorId.length() - 1) == 'R')
      {
                int classId = diceSet.rollD12();        
        
                System.out.println("GENERATING NEW RANDOM ACTOR_ID: " + actorId);
                this.actorAbilities = allocateAttributesByPriority(this.actorAbilities, classId); // Barbarian
                this.actorStr = actorAbilities[0];
                this.actorDex = actorAbilities[1];
                this.actorCon = actorAbilities[2];
                this.actorInt = actorAbilities[3];
                this.actorWis = actorAbilities[4];
                this.actorCha = actorAbilities[5];
                this.ActorId = actorId + "01"; // Barbarian
                debugActor();
      } 
      else
      {
          System.out.println("ActorId must start with 'R' for random actor generation. This branch is for deliberate actor generation.");
      }
     }
    public void debugActor()
    {
        System.out.println("DEBUG LOG FOR ActorId:" + this.ActorId); //OK
        System.out.println("Actor Attributes:");
        System.out.println("Strength: " + this.actorStr);
        System.out.println("Dexterity: " + this.actorDex);
        System.out.println("Constitution: " + this.actorCon);
        System.out.println("Intelligence: " + this.actorInt);
        System.out.println("Wisdom: " + this.actorWis);
        System.out.println("Charisma: " + this.actorCha);

    }


    // private void setActorClass(String actorClass) 
    // {
    //     ActorClass = actorClass;
    // }
    // private void getActorClass() 
    // {
    //     System.out.println(ActorClass);
    // }
    // private void showActorSimple()
    // {
    //     //print all actor attributes
        
    // }
}
