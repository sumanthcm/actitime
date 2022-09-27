package day34;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo6 {

	@Parameters({"city","pin"})
	@Test
	void testA(@Optional("Bangalore") String name, int pin) {
		Reporter.log("alloted city is "+name+" and pin code is "+pin,true);
	}

}
