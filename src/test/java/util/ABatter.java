package util;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ABatter {
   Batter batter = new Batter();

   @Nested
   class IsDone {
      // START:strikeout
      @Test
      void passesWhenStruckOut() {
         batter.strike();
         batter.strike();
         batter.strike();

         assertTrue(batter.isDone());
      }
      // END:strikeout

      // START:branchFull
      @Test
      void passesWhenWalked() {
         for (var i = 0; i < 4; i++)
            batter.ball();

         assertTrue(batter.isDone());
      }

      @Test
      void failsWhenNeitherWalkNorBall() {
         assertFalse(batter.isDone());
      }
      // END:branchFull
   }

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
      @Test
      void incrementsStrikesWhenLessThan2() {
         batter.strike();

         batter.foul();

         assertEquals(2, batter.strikes());
      }

      @Test
      void doesNotIncrementStrikesWhenAtTwo() {
         batter.strike();
         batter.strike();

         batter.foul();

         assertEquals(2, batter.strikes());
      }
   }
}
