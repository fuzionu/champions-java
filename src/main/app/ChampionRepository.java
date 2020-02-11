package app;

import java.util.HashSet;
import java.util.Set;

import static app.AttackType.MELEE;
import static app.AttackType.RANGED;
import static app.AttackType.TRANSFORM;
import static app.Resource.COURAGE;
import static app.Resource.ENERGY;
import static app.Resource.FEROCITY;
import static app.Resource.HEALTH;
import static app.Resource.MANA;
import static app.Resource.NONE;
import static app.Resource.RAGE;
import static app.Role.ASSASSIN;
import static app.Role.FIGHTER;
import static app.Role.MAGE;
import static app.Role.MARKSMAN;
import static app.Role.SUPPORT;
import static app.Role.TANK;
import static java.util.Arrays.asList;

public class ChampionRepository
{
    public Champion getChampion(String championName)
    {
        Set<Champion> arrayOfChampions = getAllChampions();

        for (Champion championFromSet : arrayOfChampions)
        {
            if (championFromSet.name.equalsIgnoreCase(championName.trim()))
            {
                return championFromSet;
            }
        }
        throw new ChampionNotFoundException();
    }

    private Set<Champion> getAllChampions()
    {
        return new HashSet<>(asList(
                new Champion("Aatrox", FIGHTER, 3881, 59, NONE, 0, 0, MELEE, 558, 1.40, 325, 178, 141, 415),
                new Champion("Ahri", ASSASSIN, 2316, 30, MANA, 43, 811, RANGED, 101, 0.85, 500, 120, 100, 493),
                new Champion("Akali", ASSASSIN, 2301, 45, ENERGY, 10, 336, MELEE, 211, 1.15, 350, 100, 100, 395),
                new Champion("Alistar", TANK, 5353, 125, MANA, 17, 21, MELEE, 107, 0.63, 325, 303, 286, 440),
                new Champion("Amumu", TANK, 4333, 57, MANA, 17, 0, MELEE, 99, 0.70, 325, 332, 301, 400),
                new Champion("Anivia", MAGE, 2250, 30, MANA, 49, 571, RANGED, 95, 0.61, 450, 105, 80, 430),
                new Champion("Annie", MAGE, 2666, 66, MANA, 66, 666, RANGED, 101, 0.88, 450, 120, 100, 399),
                new Champion("Aphelios", MARKSMAN, 1680, 13, MANA, 11, 30, RANGED, 711, 1.88, 475, 63, 39, 480),
                new Champion("Ashe", MARKSMAN, 1533, 12, MANA, 8, 0, RANGED, 491, 2.35, 500, 50, 45, 400),
                new Champion("Aurelion Sol", MAGE, 3696, 41, MANA, 83, 806, RANGED, 100, 0.70, 450, 130, 120, 444),
                new Champion("Azir", MAGE, 3111, 35, MANA, 40, 500, RANGED, 99, 1.40, 450, 150, 140, 448),
                new Champion("Bard", SUPPORT, 4881, 85, MANA, 27, 100, RANGED, 86, 0.60, 400, 253, 191, 463),
                new Champion("Blitzcrank", TANK, 5001, 54, MANA, 41, 60, MELEE, 103, 1.00, 320, 291, 200, 450),
                new Champion("Brand", MAGE, 2310, 15, MANA, 61, 758, RANGED, 100, 0.88, 450, 133, 102, 441),
                new Champion("Nasus", FIGHTER, 6356, 217, MANA, 150, 30, MELEE, 1851, 1.15, 350, 586, 411, 555),
                new Champion("Gnar", FIGHTER, 3631, 57, RAGE, 12, 50, TRANSFORM, 433, 1.44, 385, 233, 199, 427),
                new Champion("Rengar", ASSASSIN, 2999, 43, FEROCITY, 1, 0, MELEE, 601, 1.15, 350, 150, 122, 500),
                new Champion("Kled", FIGHTER, 3136, 50, COURAGE, 5, 35, TRANSFORM, 333, 1.85, 325, 100, 100, 450),
                new Champion("Vladimir", MAGE, 4000, 83, HEALTH, 83, 991, RANGED, 115, 0.91, 400, 123, 101, 413)
        ));
    }
}
