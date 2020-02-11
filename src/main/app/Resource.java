package app;

public enum Resource
{
    MANA("Mana", " per second"),
    ENERGY("Energy", " per second"),
    RAGE("Rage", " per attack or damage"),
    FEROCITY("Ferocity", " per ability"),
    COURAGE("Courage", " per attack"),
    HEALTH("Health", " per second"),
    NONE("None", null);

    public final String type;
    public final String regen;

    Resource(String type, String regen)
    {
        this.type = type;
        this.regen = regen;
    }

}
