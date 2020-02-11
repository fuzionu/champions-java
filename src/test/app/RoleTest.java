package app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RoleTest
{

    @Test
    void shouldCastToString()
    {
        // given
        Role role = Role.FIGHTER;

        // when
        String string = role.toString();

        // then
        Assertions.assertEquals("Fighter", string);
    }
}