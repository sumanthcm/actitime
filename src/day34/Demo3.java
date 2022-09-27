package day34;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo3 {
	
	@Test
	void m1() {
		Reporter.log("start", true);
		Assert.fail();
	}
	@Test(priority=1,dependsOnMethods="m1")
	public void testA() {
		Reporter.log("Open Browser", true);
		Reporter.log("Enter URL", true);
		
	}

}
