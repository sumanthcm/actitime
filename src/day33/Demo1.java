package day33;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo1 {
	@DataProvider
	String [][]getData() {
		String [][]data=new String[2][1];
		data[0][0]="hello";
		data[1][0]="world";
		return data;
	}
	@Test(dataProvider="getData")
	void TestData(String name) {
		Reporter.log("UserName:"+name, true);
	}
}
