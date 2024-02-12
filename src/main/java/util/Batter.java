package util;

// START:Batter
public class Batter {
   private int strikes = 0;

   public void foul() {
      if (strikes < 2)
         strikes++;
   }

   public void strike() {
      strikes++;
   }

   public int strikes() {
      return strikes;
   }
}
// END:Batter
