package fpoly.edu.vn.lab2;

import static org.junit.Assert.*;

import org.junit.*;

public class SuiteTest2 {
	
	@Test
	public void createAndSetName(){
		String expected = "Y";
		String actual = "Y";
		
		Assert.assertEquals(expected, actual);
		System.out.println("Suite test 1 is succesful" + actual);
	}
}
