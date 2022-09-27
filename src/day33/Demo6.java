package day33;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo6 extends Demo4 {
	@Test
	void test() {
		Reporter.log("test6() running",true);
	}
}
