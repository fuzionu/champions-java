package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChampionRepositoryTest
{
    @Test
    void shouldReturnChampion()
    {
        // given
        String championName = "Nasus";

        // when
        Champion champion = new ChampionRepository().getChampion(championName);

        // then
        assertEquals(champion.name, championName);
    }

    @Test
    void shouldThrowException_WhenChampionNotFound()
    {
        // given
        String championName = "gk";

        // when
        assertThrows(ChampionNotFoundException.class, () -> new ChampionRepository().getChampion(championName));
    }

    @Test
    void shouldReturnChampion_CaseInsensitive()
    {
        // given
        String championName = "aUrElIoN SoL";

        // when
        Champion champion = new ChampionRepository().getChampion(championName);

        // then
        assertEquals("Aurelion Sol", champion.name);
    }

    @Test
    void shouldReturnChampion_IgnoreSpace()
    {
        // given
        String championName = "  Bard ";

        // when
        Champion champion = new ChampionRepository().getChampion(championName);

        // then
        assertEquals("Bard", champion.name);
    }
}