package app;

public class ResourceType
{
    public String resourceType(Champion champion)
    {
        if (champion.resourceType.equals("Mana") || champion.resourceType.equals("Energy"))
        {
            return "Resource type: " + champion.resourceType + "\n" +
                    "Resource regen: " + champion.resourceRegen + "/s" + "\n";
        }
        else if (champion.resourceType.equals("Rage"))
        {
            return "Resource type: " + champion.resourceType + "\n" +
                    "Resource gain: " + champion.resourceRegen + "/attack or damage" + "\n";
        }
        else if (champion.resourceType.equals("Ferocity"))
        {
            return "Resource type: " + champion.resourceType + "\n" +
                    "Resource gain: " + champion.resourceRegen + "/ability" + "\n";
        }
        else if (champion.resourceType.equals("Courage"))
        {
            return "Resource type: " + champion.resourceType + "\n" +
                    "Resource gain: " + champion.resourceRegen + "/attack" + "\n";
        }
        else if (champion.resourceType.equals("Health"))
        {
            return "Resource type: Health" + "\n";
        }
        else
        {
            return "Resource type: None" + "\n";
        }
    }
}
