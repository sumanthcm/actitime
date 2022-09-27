package day33;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo5 extends Demo4 {
	@Test
	void test() {
		Reporter.log("test5() running",true);
	}
}
