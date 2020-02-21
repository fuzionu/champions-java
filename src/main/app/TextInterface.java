package app;

import app.console.ItemFormatter;

import java.util.Scanner;

public class TextInterface
{
    private final ChampionRepository championRepository;
    private final Scanner scanner;
    private ItemFormatter itemFormatter;
    private ItemRepository itemRepository;

    TextInterface(ChampionRepository championRepository, Scanner scanner, ItemFormatter itemFormatter, ItemRepository itemRepository)
    {
        this.championRepository = championRepository;
        this.scanner = scanner;
        this.itemFormatter = itemFormatter;
        this.itemRepository = itemRepository;
    }

    public void start()
    {
        do
        {
            String userInput = userInput(scanner);

            if (userInput.equalsIgnoreCase("champion"))
            {
                System.out.print("Champion: ");
                String champName = scanner.nextLine();
                showChampion(champName);
            }
            else if (userInput.equalsIgnoreCase("item"))
            {
                System.out.print("Item: ");
                String itemName = scanner.nextLine();
                showItem(itemName);
            }
            else if (userInput.equals("exit"))
            {
                System.out.println("Closing program...");
                break;
            }
            else
            {
                System.out.println("Invalid command.\n");
            }

        } while (true);
    }

    private String userInput(Scanner scanner)
    {
        System.out.println("Type \"champion\" for champion search\n" +
                "Type \"item\" for item search\n" +
                "Type \"exit\" for app close");
        System.out.print(">");
        return scanner.nextLine();
    }

    private void showItem(String userInput)
    {
        try
        {
            tryShowItem(userInput);
        }
        catch (ItemNotFoundException e)
        {
            System.out.println("Item not found! Try again.\n");
        }
    }

    private void tryShowItem(String userInput)
    {
        Item item = itemRepository.getItem(userInput);
        System.out.println(itemFormatter.formatItem(item));
        System.out.println();
    }

    private void showChampion(String userInput)
    {
        try
        {
            tryShowChampion(userInput);
        }
        catch (ChampionNotFoundException e)
        {
            System.out.println("Champion not found! Try again.\n");
        }
    }

    private void tryShowChampion(String userInput)
    {
        Champion champion = championRepository.getChampion(userInput);
        System.out.println(showChampionStats(champion));
        System.out.println();
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
