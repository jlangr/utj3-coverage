package util;

// START:ABatter
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ABatter {
   Batter batter = new Batter();

   @Nested
   class AStrike {
      @Test
      void incrementsStrikes() {
         batter.strike();

         assertEquals(1, batter.strikes());
      }
   }

   @Nested
   class AFoulBall {
      // START:increment
      @Test
      void incrementsStrikesWhenLessThan2() {
         batter.strike();

         batter.foul();

         assertEquals(2, batter.strikes());
      }
      // END:increment

      // START:noIncrement
      @Test
      void doesNotIncrementStrikesWhenAtTwo() {
         batter.strike();
         batter.strike();

         batter.foul();

         assertEquals(2, batter.strikes());
      }
      // END:noIncrement
   }
}
// END:ABatter
