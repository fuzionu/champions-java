package app.console;

import app.Item;

import java.util.List;

public class ItemFormatter
{
    public String formatItem(Item item)
    {
        if (!item.subParts.isEmpty())
        {
            return "Name: " + item.name + "\n" +
                    "Price: " + item.price + "g\n" +
                    "Subparts:\n" + subParts(item);
        }
        return "Name: " + item.name + "\n" +
                "Price: " + item.price + "g\n";
    }

    private String subParts(Item item)
    {
        if (item.subParts.isEmpty())
        {
            return "";
        }
        return subParts(item.subParts);
    }

    private String subParts(List<Item> subParts)
    {
        StringBuilder output = new StringBuilder();

        for (Item subpart : subParts)
        {
            output.append("  - ")
                    .append(subpart.name)
                    .append(" (")
                    .append(subpart.price)
                    .append("g)")
                    .append("\n")
                    .append(subParts(subpart));
        }
        return output.toString();
    }
}
