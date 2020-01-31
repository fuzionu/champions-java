public class Champion
{
    String name;
    String role;
    int health;
    int healthRegen;
    String resourceType;
    int resourceRegen;
    int abilityPower;
    String attackType;
    int attackDamage;
    double attackSpeed;
    int attackRange;
    int armor;
    int magicResist;
    int movementSpeed;

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
}
