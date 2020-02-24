package app.console;

import app.Item;
import app.DoubleSpaceMaker;

import java.util.List;

public class ItemFormatter
{
    DoubleSpaceMaker doubleSpaceMaker = new DoubleSpaceMaker();
    int x = 0;

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
            itemStringAppender(output, subpart);
        }
        return output.toString();
    }

    private void itemStringAppender(StringBuilder output, Item subpart)
    {
        x += 1;
        output.append(doubleSpaceMaker.makeDoubleSpace(x));
        output.append("- ")
                .append(subpart.name)
                .append(" (")
                .append(subpart.price)
                .append("g)")
                .append("\n")
                .append(subParts(subpart));
        x -= 1;
    }
}
