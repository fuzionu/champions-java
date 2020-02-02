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

    public Champion(String name, String role, int health, int healthRegen, String resourceType, int resourceRegen,
                    int abilityPower, String attackType, int attackDamage, double attackSpeed, int attackRange,
                    int armor, int magicResist, int movementSpeed)
    {
        this.name = name;
        this.role = role;
        this.health = health;
        this.healthRegen = healthRegen;
        this.resourceType = resourceType;
        this.resourceRegen = resourceRegen;
        this.abilityPower = abilityPower;
        this.attackType = attackType;
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
        this.attackRange = attackRange;
        this.armor = armor;
        this.magicResist = magicResist;
        this.movementSpeed = movementSpeed;
    }
}
