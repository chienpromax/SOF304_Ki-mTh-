package fpoly.edu.vn.lab2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class MathFuncTest {
	
	private MathFunc math;
	
	@Before
	public void init() {
		math = new MathFunc();
	}
	@After
	public void tearDown() {
		math = null;
	}

	@Test
	public void testGetCalls() {
		assertEquals(0, math. getCalls());
		
		math.factorial(1);
		assertEquals(1,math. getCalls());
		
		math.factorial(1);
		assertEquals(2,math. getCalls());
	}
	
	@Test
	public void testFactorial() {
		assertTrue(math.factorial(0) == 1);
		assertTrue(math.factorial(1) == 1);
		assertTrue(math.factorial(5) == 120);
	}
	@Test(expected = IllegalArgumentException.class)
	public void FactorialNegative() {
		math.factorial(-1);
	}

	@Ignore
	@Test
	public void todo() {
		assertTrue(math.push(1, 1) == 3);
	}
	
//	@Test
//	public void testPush() {
//		fail("Not yet implemented");
//	}
	

}
