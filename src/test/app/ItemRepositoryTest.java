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
        assertEquals(2, items.size());
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
        Item item = repository.getBotRK(repository.getRecurveBow(repository.getDagger()), repository.getBilgewaterCutlass(repository.getVampiricScepter(repository.getLongSword()), repository.getLongSword()));
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
        //given
        ItemRepository repository = new ItemRepository();
        // when
        Item item = repository.getNeedlesslyLargeRod();
        // then
        assertEquals("Needlessly Large Rod", item.name);
        assertEquals(1250, item.price);

    }

    @Test
    void shouldGetDagger()
    {
        // given
        ItemRepository repository = new ItemRepository();
        // when
        Item item = repository.getDagger();
        // then
        assertEquals("Dagger", item.name);
        assertEquals(300, item.price);
    }

    @Test
    void shouldGetRecurveBow()
    {
        // given
        ItemRepository repository = new ItemRepository();
        // when
        Item item = repository.getRecurveBow(null);
        // then
        assertEquals("Recurve Bow", item.name);
        assertEquals(1000, item.price);
    }

    @Test
    void shouldGetVampiricScepter()
    {
        // given
        ItemRepository repository = new ItemRepository();
        // when
        Item item = repository.getVampiricScepter(null);
        // then
        assertEquals("Vampiric Scepter", item.name);
        assertEquals(900, item.price);
    }

    @Test
    void shouldGetBilgewaterCutlass()
    {
        // given
        ItemRepository repository = new ItemRepository();
        // when
        Item item = repository.getBilgewaterCutlass(null, null);
        // then
        assertEquals("Bilgewater Cutlass", item.name);
        assertEquals(1600, item.price);
    }
}
