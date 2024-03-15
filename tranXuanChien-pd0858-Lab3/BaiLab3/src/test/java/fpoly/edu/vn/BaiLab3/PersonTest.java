package fpoly.edu.vn.BaiLab3;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PersonTest {
	@Rule
	public ExpectedException exception = ExpectedException.none();
	

	@Test
	public void testExpectedException() {
		exception.expect(IllegalArgumentException.class);
		new Person("fpoly", -1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExpectedException2() {
		new Person("fpoly", -1);
	}

	@Test
	public void testExpectedException3() {
		try {
			new Person("fpoly", -1);
			fail("should have an testExpectedException because age is invalid!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
