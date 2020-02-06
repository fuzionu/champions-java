package app;

public enum Role
{
    ASSASSIN("Assassin"),
    TANK("Tank"),
    MARKSMAN("Marksman"),
    MAGE("Mage"),
    FIGHTER("Fighter"),
    SUPPORT("Support");

    public final String role;

    Role(String role)
    {
        this.role = role;
    }

    public String getType()
    {
        return role;
    }
}
