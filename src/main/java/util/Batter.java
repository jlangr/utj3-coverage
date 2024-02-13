package util;

// START:Batter
public class Batter {
   private int strikes = 0;
   // START_HIGHLIGHT
   private int balls = 0;
   // END_HIGHLIGHT

   public void foul() {
      if (strikes < 2)
         strikes++;
   }

   // START_HIGHLIGHT
   public void ball() {
      balls++;
   }
   // END_HIGHLIGHT

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

   // START_HIGHLIGHT
   private boolean walked() {
      return balls == 4;
   }
   // END_HIGHLIGHT

   // START_HIGHLIGHT
   private boolean struckOut() {
      return strikes == 3;
   }
   // END_HIGHLIGHT
}
// END:Batter
