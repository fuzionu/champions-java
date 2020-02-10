package app;

import java.util.Scanner;

public class TextInterface
{
    public void start()
    {
        Scanner scanner = new Scanner(System.in);

        do
        {
            String userInput = userInput(scanner);

            if (userInput.equals("exit"))
            {
                System.out.println("Closing program...");
                break;
            }

            showChampion(userInput);

        } while (true);
    }

    private String userInput(Scanner scanner)
    {
        System.out.println("Type champion's name or \"exit\" to close the program");
        System.out.print(">");
        return scanner.nextLine();
    }

    private void showChampion(String userInput)
    {
        try
        {
            Champion champion = ChampionRepository.getChampion(userInput);
            System.out.println(showChampionStats(champion));
            System.out.println();
        }
        catch (ChampionNotFoundException e)
        {
            System.out.println("Champion not found! Try again.");
        }
    }

    private String showChampionStats(Champion champion)
    {
        return "Name: " + champion.name + "\n" +
                "Role: " + champion.role + "\n" +
                "Health: " + champion.health + "\n" +
                "Health regen: " + champion.healthRegen + "/s\n" +
                getResources(champion) +
                "Ability power: " + champion.abilityPower + "\n" +
                "Attack type: " + champion.attackType + "\n" +
                "Attack damage: " + champion.attackDamage + "\n" +
                "Attack speed: " + champion.attackSpeed + "\n" +
                "Attack range: " + champion.attackRange + "\n" +
                "Armor: " + champion.armor + "\n" +
                "Magic resist: " + champion.magicResist + "\n" +
                "Movement speed: " + champion.movementSpeed;
    }

    private String getResources(Champion champion)
    {
        if(champion.resourceRegenValue == 0)
        {
            return "Resource type: " + champion.resourceType.typeOfResource() + "\n";
        }

        return "Resource type: " + champion.resourceType.typeOfResource() + "\n" +
               "Resource regen: " + champion.resourceRegenValue + champion.resourceType.regenWayOfResource() + "\n";
    }
}
