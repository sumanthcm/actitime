package day34;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	
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
		
		Assert.assertEquals(testURL, actURL);
		Reporter.log("Close the browser",true);
//		if(testURL.equals(actURL)) {
//			Reporter.log("PASS: Login Page is displayed", true);
//		}
//		else {
//			Reporter.log("FAIL:Login Page is not Displayed", true);
//			Assert.fail();
//		}
	}
	
	@AfterMethod
	void m2() {
		Reporter.log("Stop",true);
	}
}
