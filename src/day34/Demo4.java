package day34;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {

	@Test
	void Register(){
		Reporter.log("This is TestA()");
		Assert.fail();
	}
	
	@Test
	void login() {
		Reporter.log("this id login()", true);
		Assert.fail();
	}
	
	//Delete() will run only if Register() and login() is passed
	@Test(priority=1,dependsOnMethods={"Register", "login"})
	void Delete() {
		Reporter.log("this is TestB()");
	}
}
