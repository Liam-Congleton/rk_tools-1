package com.realmkeeper.characterGeneration.playerClasses;

public class ClassStrategyFactory 
{
    public static ClassStrategy getClassStrategy(int classId)
    {
        switch (classId) 
        {
            case 1:
                return new BarbarianStrategy();
            case 2:
                return new BardStrategy();
            case 3:
                return new ClericStrategy();
            case 4:
                return new DruidStrategy();
            case 5:
                return new FighterStrategy();
            case 6:
                return new MonkStrategy();
            case 7:
                return new PaladinStrategy();
            case 8:
                return new RangerStrategy();
            case 9:
                return new RogueStrategy();
            case 10:
                return new SorcererStrategy();
            case 11:
                return new WarlockStrategy();
            case 12:
                return new WizardStrategy();
            default:
                return null;
        }
    }
}
