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
        int indents = 0;

        // when
        String result = spaceMaker.makeDoubleSpace(indents);

        // then
        assertEquals("  ", result);
    }

    @Test
    void shouldNotMakeAnySpace()
    {
        // given
        DoubleSpaceMaker spaceMaker = new DoubleSpaceMaker();
        int indents = 0;

        // when
        String result = spaceMaker.makeDoubleSpace(indents);

        // then
        assertEquals("  ", result);
    }

    @Test
    void shouldThrowException()
    {
        // given
        DoubleSpaceMaker spaceMaker = new DoubleSpaceMaker();
        int indents = -2;

        // then
        assertThrows(IllegalArgumentException.class, ()-> spaceMaker.makeDoubleSpace(indents));

    }
}