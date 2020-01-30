public class ChampionsLogic
{
    public static Champion CreateChampion(String name, String role, int health, String resourceType, int resourceRegen,
            int abilityPower, String attackType, String attackDamage, float attackSpeed, int attackRange, int armor,
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
}
