package day33;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo3 {
	@DataProvider
	Iterator<String[]> getData(){
		ArrayList<String[]> aList=new ArrayList<String[]>();
		String[] row1= {"sumanth","cms"};
		aList.add(row1);
		
		String[]row2= {"malnad","mce"};
		aList.add(row2);
		
		Iterator<String[]>data=aList.iterator();
		return data;
		
	}
	@Test(dataProvider="getData")
	void logIn(String un,String pw) {
		Reporter.log("UserName: "+un+"\nPassword: "+pw+" \n",true);
	}
}
