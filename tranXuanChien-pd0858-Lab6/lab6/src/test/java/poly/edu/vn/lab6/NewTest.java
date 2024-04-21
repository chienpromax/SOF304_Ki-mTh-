package poly.edu.vn.lab6;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	@BeforeTest
	public void beforeTest() {
		System.out.print("testClas: before test");
	}

	@Test
	public void lever1() {
		System.out.print("testClass: lever1 testing");
	}

	@Test
	public void lever2() {
		System.out.print("testClass: lever2 testing");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.print("testClas: before method");
	}
	
	@BeforeMethod
	public static void staticBeforeMethod() {
		System.out.print("testClas: static before method");
	}
	@Parameters({"param"})
	@BeforeMethod
	public static void BeforeMethodParameter(@Optional("default value") String p) {
	    System.out.print("testClas: before method with param" + p);
	}


	@AfterMethod
	public void afterMethod() {
		System.out.print("testClas: after method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.print("testClas: beforeClass method");
	}

	@AfterClass
	public void afterClass() {
		System.out.print("testClas: afterClass method");
	}

	@AfterTest
	public void afterTest() {
		System.out.print("testClas: after method");
	}

}
