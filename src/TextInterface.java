public class TextInterface
{
    public String showChampion(Champion champion)
    {
        return  "Name: "           + champion.name          + "\n" +
                "Role: "           + champion.role          + "\n" +
                "Health: "         + champion.health        + "\n" +
                "Health regen: "   + champion.healthRegen   + "/s\n" +
                "Resource type: "  + champion.resourceType  + "\n" +
                "Resource regen: " + champion.resourceRegen + "/s\n" +
                "Ability power: "  + champion.abilityPower  + "\n" +
                "Attack type: "    + champion.attackType    + "\n" +
                "Attack damage: "  + champion.attackDamage  + "\n" +
                "Attack speed: "   + champion.attackSpeed   + "\n" +
                "Attack range: "   + champion.attackRange   + "\n" +
                "Armor: "          + champion.armor         + "\n" +
                "Magic resist: "   + champion.magicResist   + "\n" +
                "Movement speed: "  + champion.movementSpeed;
    }
}
