package util;

// START:Batter
public class Batter {
   private int strikes = 0;
   private int balls = 0;

   public void foul() {
      if (strikes < 2)
         strikes++;
   }

   public void ball() {
      balls++;
   }

   public void strike() {
      strikes++;
   }

   public int strikes() {
      return strikes;
   }

   // START_HIGHLIGHT
   public boolean isDone() {
      return struckOut() || walked();
   }
   // END_HIGHLIGHT

   private boolean walked() {
      return balls == 4;
   }

   private boolean struckOut() {
      return strikes == 3;
   }
}
// END:Batter
