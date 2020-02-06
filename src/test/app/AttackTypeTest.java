package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AttackTypeTest
{

   @Test
   void shouldCastToString() {
       // given
       AttackType attackType = AttackType.MELEE;

       // when
       String string = attackType.toString();

       // then
       assertEquals("Melee", string);
   }


}