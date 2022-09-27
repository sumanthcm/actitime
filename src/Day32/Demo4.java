package Day32;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo4 {

	@DataProvider
	String[] getData() {
		String [] data= {"Bhanu", "Surya"};
		return data;
	}
	@Test(dataProvider="getData")
	void CreateUser(String name) {
		Reporter.log("User Name:"+name, true);
	}
}
