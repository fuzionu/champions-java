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

    public final String resourceType;
    public final String resourceRegenWay;

    Resource(String resourceType, String resourceRegenWay)
    {
        this.resourceType = resourceType;
        this.resourceRegenWay = resourceRegenWay;
    }

    public String typeOfResource()
    {
        return resourceType;
    }

    public String regenOfResource()
    {
        return resourceRegenWay;
    }
}
