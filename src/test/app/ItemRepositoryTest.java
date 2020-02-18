package app;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemRepositoryTest
{
    @Test
    void shouldGetItems()
    {
        // given
        ItemRepository repository = new ItemRepository();
        // when
        Set<Item> items = repository.getItems();
        // then
        assertEquals(1, items.size());
    }

    @Test
    void shouldGetRabadon()
    {
        // given
        ItemRepository repository = new ItemRepository();
        // when
        Item item = repository.getRabadon(null);
        // then
        assertEquals("Rabadon's Deathcap", item.name);
        assertEquals(3600, item.price);
    }

    @Test
    void shouldGetBotRK()
    {
        // given
        ItemRepository repository = new ItemRepository();
        // when
        Item item = repository.getBotRK();
        // then
        assertEquals("Blade of the Ruined King", item.name);
        assertEquals(3600, item.price);
    }

    @Test
    void shouldGetLongSword()
    {
        // given
        ItemRepository repository = new ItemRepository();
        // when
        Item item = repository.getLongSword();
        // then
        assertEquals("Long Sword", item.name);
        assertEquals(350, item.price);
    }

    @Test
    void shouldGetNeedlesslyLargeRod()
    {
        // given

        // when

        // then

    }

    @Test
    void shouldGetDagger()
    {
        // given

        // when

        // then

    }

    @Test
    void shouldGetRecurveBow()
    {
        // given

        // when

        // then

    }

    @Test
    void shouldGetVampiricScepter()
    {
        // given

        // when

        // then

    }

    @Test
    void shouldGetBilgewaterCutlass()
    {
        // given

        // when

        // then

    }


}