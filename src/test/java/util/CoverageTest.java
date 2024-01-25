package util;

import org.junit.jupiter.api.Test;

class CoverageTest {
   // START:noIncrementOfCount
   @Test
   void noIncrementOfCount() {
      new Coverage().soleMethod();
   }
   // END:noIncrementOfCount

   @Test
   void incrementOfCount() {
      var c = new Coverage();
      c.count = 1;
      c.soleMethod();
   }
}
