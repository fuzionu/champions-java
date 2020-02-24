package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleSpaceMakerTest
{
    @Test
    void shouldMakeTwoSpaces()
    {
        // given
        DoubleSpaceMaker spaceMaker = new DoubleSpaceMaker();
        int doubleSpaceMultiplier = 1;

        // when
        String result = spaceMaker.makeDoubleSpace(doubleSpaceMultiplier);

        // then
        assertEquals("  ", result);
    }

    @Test
    void shouldNotMakeAnySpace()
    {
        // given
        DoubleSpaceMaker spaceMaker = new DoubleSpaceMaker();
        int doubleSpaceMultiplier = 0;

        // when
        String result = spaceMaker.makeDoubleSpace(doubleSpaceMultiplier);

        // then
        assertEquals("", result);
    }

    @Test
    void shouldThrowException()
    {
        // given
        DoubleSpaceMaker spaceMaker = new DoubleSpaceMaker();
        int doubleSpaceMultiplier = -2;

        // then
        assertThrows(IllegalArgumentException.class, ()-> spaceMaker.makeDoubleSpace(doubleSpaceMultiplier));

    }
}