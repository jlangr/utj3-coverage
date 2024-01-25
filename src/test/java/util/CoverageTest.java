package util;

import org.junit.jupiter.api.Test;

class CoverageTest {
   @Test
   void noIncrementOfCount() {
      new Coverage().soleMethod();
   }

   @Test
   void incrementOfCount() {
      var c = new Coverage();
      c.count = 1;
      c.soleMethod();
   }
}
