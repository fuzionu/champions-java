import java.util.Scanner;

public class TextInterface
{
    public String showChampion(Champion champion)
    {
        return  "Name: "           + champion.name          + "\n" +
                "Role: "           + champion.role          + "\n" +
                "Health: "         + champion.health        + "\n" +
                "Health regen: "   + champion.healthRegen   + "/s\n" +
                "Resource type: "  + champion.resourceType  + "\n" +
                "Resource regen: " + champion.resourceRegen + "/s\n" +
                "Ability power: "  + champion.abilityPower  + "\n" +
                "Attack type: "    + champion.attackType    + "\n" +
                "Attack damage: "  + champion.attackDamage  + "\n" +
                "Attack speed: "   + champion.attackSpeed   + "\n" +
                "Attack range: "   + champion.attackRange   + "\n" +
                "Armor: "          + champion.armor         + "\n" +
                "Magic resist: "   + champion.magicResist   + "\n" +
                "Movement speed: "  + champion.movementSpeed;
    }

    public void start()
    {
        Scanner scanner = new Scanner(System.in);
        TextInterface textInterface = new TextInterface();

        do
        {
            System.out.println("Type champion's name or \"exit\" to close the program");
            System.out.print(">");
            String userInput = scanner.nextLine();

            if (userInput.equals("exit"))
            {
                System.out.println("Closing program...");
                break;
            }

            try
            {
                Champion champion = ChampionRepository.getChampion(userInput);
                System.out.println(textInterface.showChampion(champion));
                System.out.println();
            }
            catch (ChampionNotFoundException e)
            {
                System.out.println("Champion not found! Try again.");
            }

        } while (true);
    }

}
