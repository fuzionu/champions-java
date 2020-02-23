package app.console;

import app.Item;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemFormatterTest
{
    @Test
    void shouldFormatItem()
    {
        // given
        ItemFormatter formatter = new ItemFormatter();

        Item item = item("Przedmiot", 100, singletonList(item("Przedmiot_1")));

        // when
        String result = formatter.formatItem(item);

        // then
        assertEquals("Name: Przedmiot\n" +
                "Price: 100g\n" +
                "Subparts:\n" +
                "  - Przedmiot_1 (0g)\n", result);
    }

    @Test
    void shouldFormatItem_4subParts()
    {
        //given
        ItemFormatter formatter = new ItemFormatter();

        Item item = item("Przedmiot", 100, asList(
                item("Przedmiot_1"),
                item("Przedmiot_2"),
                item("Przedmiot_3"),
                item("Przedmiot_4")));

        //when
        String result = formatter.formatItem(item);

        //then
        assertEquals("Name: Przedmiot\n" +
                "Price: 100g\n" +
                "Subparts:\n" +
                "  - Przedmiot_1 (0g)\n" +
                "  - Przedmiot_2 (0g)\n" +
                "  - Przedmiot_3 (0g)\n" +
                "  - Przedmiot_4 (0g)\n", result);
    }

    @Test
    void shouldFormatItem_noSubParts()
    {
        // given
        ItemFormatter formatter = new ItemFormatter();
        Item item = item("Przedmiot", 100, emptyList());

        // when
        String result = formatter.formatItem(item);

        // then
        assertEquals("Name: Przedmiot\n" +
                "Price: 100g\n", result);
    }

    @Test
    void shouldFormatItem_2subParts_2subParts()
    {
        //given
        ItemFormatter formatter = new ItemFormatter();

        Item item = item("Przedmiot", 100, asList(
                item("Przedmiot_1", asList(
                        item("Przedmiot_a"),
                        item("Przedmiot_b"))),
                item("Przedmiot_2")
        ));

        //when
        String result = formatter.formatItem(item);

        //then
        assertEquals("Name: Przedmiot\n" +
                "Price: 100g\n" +
                "Subparts:\n" +
                "  - Przedmiot_1 (0g)\n" +
                "    - Przedmiot_a (0g)\n" +
                "    - Przedmiot_b (0g)\n" +
                "  - Przedmiot_2 (0g)\n", result);
    }

    private Item item(String name)
    {
        return item(name, emptyList());
    }

    private Item item(String name, int price, List<Item> items)
    {
        Item item = new Item();
        item.name = name;
        item.price = price;
        item.subParts = items;
        return item;
    }

    private Item item(String name, List<Item> items)
    {
        Item item1 = new Item();
        item1.name = name;
        item1.subParts = items;
        return item1;
    }
}
