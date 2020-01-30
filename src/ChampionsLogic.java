import java.util.HashSet;
import java.util.Set;

public class ChampionsLogic
{
    public static Champion CreateChampion(String name, String role, int health, String resourceType, int resourceRegen,
            int abilityPower, String attackType, int attackDamage, double attackSpeed, int attackRange, int armor,
            int magicResist, int movementSpeed)
    {
        Champion champion = new Champion();

        champion.name = name;
        champion.role = role;
        champion.health = health;
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

        ChampionsSet.add(CreateChampion("Ahri", "Assasin", 2316, "Mana", 30,
        803, "Ranged", 120, 0.78, 500, 120, 100, 488));

        return ChampionsSet;
    }
}
