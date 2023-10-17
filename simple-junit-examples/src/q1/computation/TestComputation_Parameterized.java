package q1.computation;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestComputation_Parameterized {
   int mInput1, mInput2, mExpected;
   Computation com = new Computation();

   @Parameters
   public static Collection<Object[]> data() {
      return Arrays.asList(new Object[][] { //
    	  {100,1,20}, //
    	  {101,2,30}, //
    	  {102,3,40} });
   }

   public TestComputation_Parameterized(int input1, int input2, int expected) {
	   
	  this.mInput1 = input1; 
 	  this.mInput2 = input2; 
 	  this.mExpected = expected; 
 	  
 	  int actualResult = com.getDiscount(mInput1, mInput2);
 	  Assert.assertEquals(mExpected, actualResult);
   }

   @Test
   public void testGetDiscount() throws Exception {
 	  int input1 = 100, input2 = 1, mExpected = 20;
 	  int result = com.getDiscount(input1, input2);
      Assert.assertEquals(mExpected, result);
   }
}
