package com.realmkeeper.characterGeneration.playerClasses;

public interface ClassStrategy 
{
    int[] actorAbilities = null;
    public int[] assignAttributes(int [] rolledAttributes);
    public void debugActor();
    public void assignHealth();

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
