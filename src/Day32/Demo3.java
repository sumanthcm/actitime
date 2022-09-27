package Day32;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	@Test(invocationCount=4)
	public void createUser()
	{
		Reporter.log("Hello", true);
	}
	
	void creatCust() {
		for(int i=0;i<4;i++)
			Reporter.log("Create customer",true);
	}
}
