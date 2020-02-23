package app.console;

import app.Item;
import org.junit.jupiter.api.Test;

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

        Item item2 = new Item();
        item2.name = "Przedmiot_1";
        item2.subParts = emptyList();

        Item item = new Item();
        item.name = "Przedmiot";
        item.price = 100;
        item.subParts = singletonList(item2);

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

        Item item1 = new Item();
        item1.name = "Przedmiot_1";
        item1.subParts = emptyList();

        Item item2 = new Item();
        item2.name = "Przedmiot_2";
        item2.subParts = emptyList();

        Item item3 = new Item();
        item3.name = "Przedmiot_3";
        item3.subParts = emptyList();

        Item item4 = new Item();
        item4.name = "Przedmiot_4";
        item4.subParts = emptyList();

        Item item = new Item();
        item.name = "Przedmiot";
        item.price = 100;
        item.subParts = asList(item1, item2, item3, item4);

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
        Item item = new Item();
        item.name = "Przedmiot";
        item.price = 100;
        item.subParts = emptyList();

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

        Item item1 = new Item();
        item1.name = "Przedmiot_1";

        Item item2 = new Item();
        item2.name = "Przedmiot_a";
        item2.subParts = emptyList();

        Item item3 = new Item();
        item3.name = "Przedmiot_b";
        item3.subParts = emptyList();

        Item item4 = new Item();
        item4.name = "Przedmiot_2";
        item4.subParts = emptyList();

        Item item = new Item();
        item.name = "Przedmiot";
        item.price = 100;
        item.subParts = asList(item1, item4);
        item1.subParts = asList(item2, item3);

        //when
        String result = formatter.formatItem(item);

        //then
        assertEquals("Name: Przedmiot\n" +
                "Price: 100g\n" +
                "Subparts:\n" +
                "  - Przedmiot_1 (0g)\n" +
                "Subparts:\n" +
                "  - Przedmiot_a (0g)\n" +
                "  - Przedmiot_b (0g)\n" +
                "  - Przedmiot_2 (0g)\n", result);
    }


}