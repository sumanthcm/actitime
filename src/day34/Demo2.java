package day34;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo2 {
	
	@BeforeMethod
	void m1() {
		Reporter.log("start", true);
	}
	@Test
	public void testA() {
		Reporter.log("Open Browser", true);
		Reporter.log("Enter URL", true);
		String testURL="Login";
		String actURL="Login2";
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(testURL, actURL);
		Reporter.log("Close the browser",true);
		sa.assertAll("programs stops");
	}
	
	@AfterMethod
	void m2() {
		Reporter.log("Stop",true);
	}
}
