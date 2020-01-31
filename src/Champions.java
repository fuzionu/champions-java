import java.util.HashSet;
import java.util.Set;

public class Champions
{
    static Set<Champion> championsSet = new HashSet<>();

    public static Champion createChampion(String name, String role, int health, int healthRegen, String resourceType,
    int resourceRegen, int abilityPower, String attackType, int attackDamage, double attackSpeed, int attackRange,
    int armor, int magicResist, int movementSpeed)
    {
        Champion champion = new Champion();

        champion.name = name;
        champion.role = role;
        champion.health = health;
        champion.healthRegen = healthRegen;
        champion.resourceType = resourceType;
        champion.resourceRegen = resourceRegen;
        champion.abilityPower = abilityPower;
        champion.attackType = attackType;
        champion.attackDamage = attackDamage;
        champion.attackSpeed = attackSpeed;
        champion.attackRange = attackRange;
        champion.armor = armor;
        champion.magicResist = magicResist;
        champion.movementSpeed = movementSpeed;

        return champion;
    }

    public static Set<Champion> getAllChampions()
    {
        championsSet.add(createChampion("Aatrox", "Warrior", 3881, 59, "None", 0, 0, "Melee", 558, 1.40, 325, 178, 141, 415));
        championsSet.add(createChampion("Ahri", "Assasin", 2316, 30,"Mana", 30, 803, "Ranged", 120, 0.78, 500, 120, 100, 488));
        championsSet.add(createChampion("Akali", "Assassin", 2301, 45, "Energy", 10, 336, "Melee", 211,  1.15, 350, 100, 100, 395));
        championsSet.add(createChampion("Alistar", "Tank", 5353, 125, "Mana", 17, 21, "Melee", 107, 0.63, 325, 303, 286, 440));
        championsSet.add(createChampion("Amumu", "Tank", 4333, 57, "Mana", 17, 0, "Melee", 99, 0.70, 325, 332, 301, 400));
        championsSet.add(createChampion("Anivia", "Mage", 2250, 30, "Mana", 49, 571, "Ranged", 95, 0.61, 450, 105, 80, 430));
        championsSet.add(createChampion("Annie", "Mage", 2666, 66, "Mana", 66, 666, "Ranged", 101, 0.88, 450, 120, 100, 399));
        championsSet.add(createChampion("Aphelios", "Marksman", 1680, 13, "Mana", 11, 30, "Ranged", 711, 1.88, 475, 63, 39, 480));
        championsSet.add(createChampion("Ashe", "Marksman", 1533, 12, "Mana", 8, 0, "Ranged", 491, 2.35, 500, 50, 45, 400));
        championsSet.add(createChampion("Aurelion Sol", "Mage", 3696, 41, "Mana", 83, 806, "Ranged", 100, 0.70, 450, 130, 120, 444));
        championsSet.add(createChampion("Azir", "Mage", 3111, 35, "Mana", 40, 500, "Ranged", 99, 1.40, 450, 150, 140, 448));
        championsSet.add(createChampion("Bard", "Support", 4881, 85, "Mana", 27, 100, "Ranged", 86, 0.60, 400, 253, 191, 463));
        championsSet.add(createChampion("Blitzcrank", "Tank", 5001, 54, "Mana", 41, 60, "Melee", 103, 1.00, 320, 291, 200, 450));
        championsSet.add(createChampion("Brand", "Mage", 2310, 15, "Mana", 61, 758, "Ranged", 100, 0.88, 450, 133, 102, 441));
        championsSet.add(createChampion("Nasus", "Warrior", 6356, 217, "Mana", 150, 30, "Melee", 1851, 1.15, 350, 586, 411, 555));
        championsSet.add(createChampion("Gnar", "Warrior", 3631, 57, "Rage", 12, 50, "Melee / Ranged", 433, 1.44, 385, 233, 199, 427));
        championsSet.add(createChampion("Rengar", "Assassin", 2999, 43, "Ferocity", 1, 0, "Melee", 601, 1.15, 350, 150, 122, 500));
        championsSet.add(createChampion("Kled", "Warrior", 3136, 50, "Courage", 5, 35, "Meele", 333, 1.85, 325, 100, 100, 450));
        championsSet.add(createChampion("Vladimir", "Mage", 4000, 83, "Health", 83, 991, "Ranged", 115, 0.91, 400, 123, 101, 413));

        return championsSet;
    }

    public static Champion getChampion(String championName)
    {
        Set<Champion> arrayOfChampions = getAllChampions();
        Champion champion = new Champion();

        for (Champion championFromSet : arrayOfChampions)
        {
            if (championFromSet.name.equalsIgnoreCase(championName.trim()))
            {
                champion = championFromSet;
            }
        }

        return champion;
    }

    public static String showChampion(Champion champion)
    {
        return  "Name: "           + champion.name          + "/n" +
                "Role: "           + champion.role          + "/n" +
                "Health: "         + champion.health        + "/n" +
                "Health regen: "   + champion.healthRegen   + "/n" +
                "Resource type: "  + champion.resourceType  + "/n" +
                "Resource regen: " + champion.resourceRegen + "/n" +
                "Ability power: "  + champion.abilityPower  + "/n" +
                "Attack type: "    + champion.attackType    + "/n" +
                "Attack damage: "  + champion.attackDamage  + "/n" +
                "Attack speed: "   + champion.attackSpeed   + "/n" +
                "Attack range: "   + champion.attackRange   + "/n" +
                "Armor: "          + champion.armor         + "/n" +
                "Magic resist: "   + champion.magicResist   + "/n" +
                "Movement speed "  + champion.movementSpeed + "/n";
    }
}
