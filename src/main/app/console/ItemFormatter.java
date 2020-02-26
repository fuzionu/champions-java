package app.console;

import app.Item;
import app.DoubleSpaceMaker;

import java.util.List;

public class ItemFormatter
{
    DoubleSpaceMaker doubleSpaceMaker = new DoubleSpaceMaker();


    public String formatItem(Item item)
    {
        if (!item.subParts.isEmpty())
        {
            return "Name: " + item.name + "\n" +
                    "Price: " + item.price + "g\n" +
                    "Subparts:\n" + subParts(item, 0);
        }
        return "Name: " + item.name + "\n" +
                "Price: " + item.price + "g\n";
    }


    private String subParts(Item item, int indents)
    {
        if (item.subParts.isEmpty())
        {
            return "";
        }
        return subParts(item.subParts, indents);
    }

    private String subParts(List<Item> subParts, int indents)
    {
        StringBuilder output = new StringBuilder();

        for (Item subpart : subParts)
        {
            itemStringAppender(output, subpart, indents);
        }

        return output.toString();
    }

    private void itemStringAppender(StringBuilder output, Item subpart, int indents)
    {
        output.append(doubleSpaceMaker.makeDoubleSpace(indents));
        output.append("- ")
                .append(subpart.name)
                .append(" (")
                .append(subpart.price)
                .append("g)")
                .append("\n")
                .append(subParts(subpart, indents + 2));
    }
}
