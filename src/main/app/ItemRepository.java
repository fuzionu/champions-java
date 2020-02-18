package app;

import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;
import static java.util.Collections.*;

public class ItemRepository
{
    private Item item(String name, int price, String image, List<Item> subParts)
    {
        Item item = new Item();
        item.name = name;
        item.price = price;
        item.image = image;
        item.subParts = subParts;
        return item;
    }

    public Set<Item> getItems()
    {
        Item item = getRabadon(getNeedlesslyLargeRod());

        return singleton(item);
    }

    public Item getRabadon(Item subpart)
    {
        return item("Rabadon's Deathcap", 3600, "rabadon.png", asList(subpart, subpart));
    }

    public Item getBotRK()
    {
        return item("Blade of the Ruined King", 3600, "botrk.png",
                asList(getRecurveBow(getDagger()), getBilgewaterCutlass(getVampiricScepter(getLongSword()), getLongSword())));
    }

    public Item getLongSword()
    {
        return item("Long Sword", 350, "longsword.png", emptyList());
    }

    public Item getNeedlesslyLargeRod()
    {
        return item("Needlessly Large Rod", 1250, "largerod.png", emptyList());
    }

    public Item getDagger()
    {
        return item("Dagger", 300, "dagger.png", emptyList());
    }

    public Item getRecurveBow(Item dagger)
    {
        return item("Recurve Bow", 1000, "recurvebow.png", asList(dagger, dagger));
    }

    public Item getVampiricScepter(Item longSword)
    {
        return item("Vampiric Scepter", 900, "vampiricscepter.png", singletonList(longSword));
    }

    public Item getBilgewaterCutlass(Item vampiricScepter, Item longSword)
    {
        return item("Bilgewater Cutlass", 1600, "bilgewatercutlass.png", asList(vampiricScepter, longSword));
    }
}
