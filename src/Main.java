import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

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
                Champion champion = Champions.getChampion(userInput);
                System.out.println(Champions.showChampion(champion));
                System.out.println();
            }
            catch (ChampionNotFoundException e)
            {
                System.out.println("Champion not found! Try again.");
            }

        } while (true);

    }
}
