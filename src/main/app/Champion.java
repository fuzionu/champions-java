package app;

public class Champion
{
    final String name;
    final Role role;
    final int health;
    final int healthRegen;
    final Resource resource;
    final int resourceRegen;
    final int abilityPower;
    final AttackType attackType;
    final int attackDamage;
    final double attackSpeed;
    final int attackRange;
    final int armor;
    final int magicResist;
    final int movementSpeed;

    public Champion(String name, Role role, int health, int healthRegen, Resource resource,
                    int resourceRegen, int abilityPower, AttackType attackType, int attackDamage, double attackSpeed,
                    int attackRange, int armor, int magicResist, int movementSpeed)
    {
        this.name = name;
        this.role = role;
        this.health = health;
        this.healthRegen = healthRegen;
        this.resource = resource;
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