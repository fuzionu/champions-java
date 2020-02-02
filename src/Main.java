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

            if (champName.equals("exit"))
            {
                doContinue = false;
            }
            else
            {
                System.out.println(Champions.showChampion(Champions.getChampion(champName)));
            }


        } while (doContinue);

    }
}
