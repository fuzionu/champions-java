package app;

import java.util.Scanner;

public class TextInterface
{
    private final ChampionRepository championRepository;
    private final Scanner scanner;

    TextInterface()
    {
        championRepository = new ChampionRepository();
        scanner = new Scanner(System.in);
    }

    public void start()
    {
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
            Champion champion = championRepository.getChampion(userInput);
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
                formatResource(champion) +
                "Ability power: " + champion.abilityPower + "\n" +
                "Attack type: " + champion.attackType + "\n" +
                "Attack damage: " + champion.attackDamage + "\n" +
                "Attack speed: " + champion.attackSpeed + "\n" +
                "Attack range: " + champion.attackRange + "\n" +
                "Armor: " + champion.armor + "\n" +
                "Magic resist: " + champion.magicResist + "\n" +
                "Movement speed: " + champion.movementSpeed;
    }

    private String formatResource(Champion champion)
    {
        if (champion.resourceRegen == 0)
        {
            return "Resource type: " + champion.resource.type + "\n";
        }

        return "Resource type: " + champion.resource.type + "\n" +
                "Resource regen: " + champion.resourceRegen + champion.resource.regen + "\n";
    }
}
