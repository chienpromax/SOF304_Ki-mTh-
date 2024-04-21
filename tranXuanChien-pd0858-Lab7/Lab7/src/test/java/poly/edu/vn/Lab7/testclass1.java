package poly.edu.vn.Lab7;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testclass1 {

	@Test(groups = "myGroup")
	public void t1() {
		Assert.assertTrue(true);
	}

	@Test(groups = "myGroup")
	public void t2() {
		Assert.assertTrue(true);
	}

	@Test(groups = "myGroup")
	public void t3() {
	}

	@Test
	public void t4() {
	}

	@Test(dataProvider = "dp")
	public void t5(String param) {
		
	}
		
	@DataProvider
	private Object[][] dp() {
		return new Object[][] {{"one"},{"two"}};	
	}
}
