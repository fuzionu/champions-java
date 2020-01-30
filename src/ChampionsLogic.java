import java.util.HashSet;
import java.util.Set;

public class ChampionsLogic
{
    public static Champion CreateChampion(String name, String role, int health, int healthRegen, String resourceType,
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

    public static Set GetAllChampions()
    {
        Set<Champion> ChampionsSet = new HashSet<>();

        ChampionsSet.add(CreateChampion("Aatrox", "Warrior", 3881, 59, "None", 0, 0, "Melee", 558, 1.40, 325, 178, 141, 415));
        ChampionsSet.add(CreateChampion("Ahri", "Assasin", 2316, 30,"Mana", 30, 803, "Ranged", 120, 0.78, 500, 120, 100, 488));
        ChampionsSet.add(CreateChampion("Akali", "Assassin", 2301, 45, "Energy", 10, 336, "Melee", 211,  1.15, 350, 100, 100, 395));
        ChampionsSet.add(CreateChampion("Alistar", "Tank", 5353, 125, "Mana", 17, 21, "Melee", 107, 0.63, 325, 303, 286, 440));
        ChampionsSet.add(CreateChampion("Amumu", "Tank", 4333, 57, "Mana", 17, 0, "Melee", 99, 0.70, 325, 332, 301, 400));
        ChampionsSet.add(CreateChampion("Anivia", "Mage", 2250, 30, "Mana", 49, 571, "Ranged", 95, 0.61, 450, 105, 80, 430));
        ChampionsSet.add(CreateChampion("Annie", "Mage", 2666, 66, "Mana", 66, 666, "Ranged", 101, 0.88, 450, 120, 100, 399));
        ChampionsSet.add(CreateChampion("Aphelios", "Marksman", 1680, 13, "Mana", 11, 30, "Ranged", 711, 1.88, 475, 63, 39, 480));
        ChampionsSet.add(CreateChampion("Ashe", "Marksman", 1533, 12, "Mana", 8, 0, "Ranged", 491, 2.35, 500, 50, 45, 400));
        ChampionsSet.add(CreateChampion("Aurelion Sol", "Mage", 3696, 41, "Mana", 83, 806, "Ranged", 100, 0.70, 450, 130, 120, 444));
        ChampionsSet.add(CreateChampion("Azir", "Mage", 3111, 35, "Mana", 40, 500, "Ranged", 99, 1.40, 450, 150, 140, 448));
        ChampionsSet.add(CreateChampion("Bard", "Support", 4881, 85, "Mana", 27, 100, "Ranged", 86, 0.60, 400, 253, 191, 463));
        ChampionsSet.add(CreateChampion("Blitzcrank", "Tank", 5001, 54, "Mana", 41, 60, "Melee", 103, 1.00, 320, 291, 200, 450));
        ChampionsSet.add(CreateChampion("Brand", "Mage", 2310, 15, "Mana", 61, 758, "Ranged", 100, 0.88, 450, 133, 102, 441));
        ChampionsSet.add(CreateChampion("Nasus", "Warrior", 6356, 217, "Mana", 150, 30, "Melee", 1851, 1.15, 350, 586, 411, 555));
        ChampionsSet.add(CreateChampion("Gnar", "Warrior", 3631, 57, "Rage", 12, 50, "Melee / Ranged", 433, 1.44, 385, 233, 199, 427));
        ChampionsSet.add(CreateChampion("Rengar", "Assassin", 2999, 43, "Ferocity", 1, 0, "Melee", 601, 1.15, 350, 150, 122, 500));
        ChampionsSet.add(CreateChampion("Kled", "Warrior", 3136, 50, "Courage", 5, 35, "Meele", 333, 1.85, 325, 100, 100, 450));
        ChampionsSet.add(CreateChampion("Vladimir", "Mage", 4000, 83, "Health", 83, 991, "Ranged", 115, 0.91, 400, 123, 101, 413));

        return ChampionsSet;
    }
}
