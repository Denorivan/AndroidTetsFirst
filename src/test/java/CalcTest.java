
import org.testng.Assert;

import org.testng.annotations.Test;


public class CalcTest extends BaseTest{


        @Test
        public void sampleTest() {
                driver.findElementById("com.google.android.calculator:id/digit_9").click();
                System.out.println("clicked");
                driver.findElementById("com.google.android.calculator:id/op_add").click();
                System.out.println("clicked");
                driver.findElementById("com.google.android.calculator:id/digit_3").click();
                System.out.println("clicked");
                driver.findElementById("com.google.android.calculator:id/eq").click();
                System.out.println("clicked");
                Assert.assertEquals(driver.findElementById("com.google.android.calculator:id/result_final").getText(), "12");
                System.out.println("Passed!");

        }



}
