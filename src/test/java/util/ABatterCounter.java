package util;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ABatterCounter {
   BatterCounter counter = new BatterCounter();

   @Nested
   class AFoulBall {

      // START:increment
      @Test
      void incrementsStrikesWhenLessThan2() {
         counter.strike();

         counter.foul();

         assertEquals(2, counter.strikes());
      }
      // END:increment

      // START:noIncrement
      @Test
      void doesNotIncrementStrikesWhenAtTwo() {
         counter.strike();
         counter.strike();

         counter.foul();

         assertEquals(2, counter.strikes());
      }
      // END:noIncrement
   }
}
