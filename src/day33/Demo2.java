package day33;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo2 {
	@DataProvider
	String [][]getData(){
		String [][]data=new String[2][2];
		data[0][0]="sumanth";
		data[0][1]="cms";
		
		data[1][0]="malnad";
		data[1][1]="mce";
		return data;
	}
	@Test(dataProvider="getData")
	void logIn(String un,String pw) {
		Reporter.log("UserName: "+un+"\nPassword: "+pw+" \n",true);
	}
}
