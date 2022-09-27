package day33;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo7 {
	@BeforeSuite
	void m1() {
		Reporter.log("@Before Suite", true);
	}
	
	@AfterSuite
	void m2() {
		Reporter.log("@After Suite",true);
	}
	
	@BeforeClass
	void m3() {
		Reporter.log("@Before Class",true);
	}
	
	@AfterClass
	void m4() {
		Reporter.log("@After Class",true);
	}
	
	@BeforeMethod
	void m5() {
		Reporter.log("@Before method",true);
	}
	
	@AfterMethod
	void m6() {
		Reporter.log("@After method",true);
	}
	
	@BeforeTest()
	void m7() {
		Reporter.log("@BeforeTest", true);
	}
	
	@AfterTest
	void m8() {
		Reporter.log("@AfterTest", true);
	}
	@Test
	void testMsg() {
		Reporter.log("Test() running", true);
	}
}
