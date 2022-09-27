package Day32;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	@Test(priority = 2)
	public void editUser() {
		Reporter.log("Edit User",true);
	}
	
	@Test(priority = 3)
	public void deleteUser() {
		Reporter.log("Delete User",true);
	}
	
	@Test(priority = 1)
	public void registerUser() {
		Reporter.log("register User",true);
	}
}
