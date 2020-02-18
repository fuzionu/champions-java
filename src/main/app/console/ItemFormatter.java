package app.console;

import app.Item;

public class ItemFormatter
{
    public String formatItem(Item item)
    {
        return "Name: " + item.name + "\n" +
                "Price: " + item.price + "g\n" +
                "Subparts:\n" +
                "  - " + item.subParts.get(0).name;
    }
}
