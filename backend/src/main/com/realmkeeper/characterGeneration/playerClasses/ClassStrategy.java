package com.realmkeeper.characterGeneration.playerClasses;

public class ClassStrategy 
{
    int[] actorAbilities = null;
    public int actorHealth;
    public String ActorId;
    
    private String actorClass;
     

    public int[] assignAttributes(int [] rolledAttributes)
    {
        return rolledAttributes; 
    }
    public void debugActor()
    {

    }
    public void assignHealth()
    {

    }
    public String getClassName()
    {
        return this.actorClass;
    }
    public int getProficiency(int attributeSelect)
    {
        return ((this.actorAbilities[attributeSelect] - 10) / 2);
    }
    // public int[] assignSkills();
    // public int[] assignSaves();
    // public int[] assignProficiencies();
    // public int[] assignEquipment();
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
}
