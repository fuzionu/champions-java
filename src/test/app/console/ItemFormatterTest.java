package app.console;

import app.Item;
import org.junit.jupiter.api.Test;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemFormatterTest
{

    @Test
    void shouldFormatItem()
    {
        // given
        ItemFormatter formatter = new ItemFormatter();
        Item item = new Item();
        Item item2 = new Item();
        item2.name = "Przedmiot_1";
        item.name = "Przedmiot";
        item.price = 100;
        item.subParts = singletonList(item2);

        // when
        String result = formatter.formatItem(item);

        // then
        assertEquals("Name: Przedmiot\n" +
                "Price: 100g\n" +
                "Subparts:\n" +
                "  - Przedmiot_1", result);
    }

}