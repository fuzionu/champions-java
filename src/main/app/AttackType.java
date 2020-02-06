package app;

public enum AttackType
{
    MELEE("Melee"),
    RANGED("Ranged"),
    TRANSFORM("Transform");

    public final String attackType;

    AttackType(String attackType)
    {
        this.attackType = attackType;
    }

    public String toString()
    {
        return attackType;
    }
}