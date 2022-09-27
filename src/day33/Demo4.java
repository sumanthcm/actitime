package day33;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo4 {

	@BeforeClass
	void openBrowser() {
		Reporter.log("Open Browser",true);
	}
	
	@AfterClass
	void closeBrowser() {
		Reporter.log("CloseBrowser",true);
	}
	@BeforeMethod    //this will run before every Test method
	void login() {
		Reporter.log("Login",true);
	}
	
	@AfterMethod     //this will run after every Test method
	void logout() {
		Reporter.log("Logout",true);
	}
	
	@Test
	void createUser() {
		Reporter.log("Create User",true);
	}
	
	@Test
	void editUser() {
		Reporter.log("Edit User",true);
	}
}
