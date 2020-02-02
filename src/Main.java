import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean doContinue = true;

        do
        {
            System.out.println("Type \"exit\" to close the program.");
            System.out.print("Enter champ name: ");
            String champName = scanner.nextLine();

            Champion champion = Champions.getChampion(champName);

            if (champName.equals("exit"))
            {
                doContinue = false;
                System.out.println("Closing program...");
            }
            else
            {
                if (champion == null)
                {
                    System.out.println("Champion not found! Try again.");
                }
                else
                {
                    System.out.println(Champions.showChampion(champion));
                }
            }

            System.out.println();

        } while (doContinue);

    }
}
