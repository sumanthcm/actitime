package Day32;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void testA(){
		System.out.println("Executing TestA");
		
		Reporter.log("hi this is testing");
		Reporter.log("hi this is testing",false);
		Reporter.log("hi this is testing",true);
	}
}
