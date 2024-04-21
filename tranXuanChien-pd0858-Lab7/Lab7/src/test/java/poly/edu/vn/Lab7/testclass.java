package poly.edu.vn.Lab7;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testclass {

	@Test
	public void a1() {
	}
	
	@Parameters("param")
	@Test
	public void a2(@Optional("") String param) {
	}

	
	@Test(enabled = false)
	public void a3() {
	}
}
