package app;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        new TextInterface(new ChampionRepository(), new Scanner(System.in)).start();
    }
}
