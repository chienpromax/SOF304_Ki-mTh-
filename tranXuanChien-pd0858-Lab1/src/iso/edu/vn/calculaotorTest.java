package iso.edu.vn;

import static org.junit.Assert.assertEquals;
import javax.annotation.processing.Generated;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class calculaotorTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private calculaotor createTestSubject() {
		return new calculaotor();
	}

	@Test
	public void testAdd() throws Exception {
		calculaotor testSubject;
		int a = 1;
		int b = 2;
		int result;
		int expected = 3;


		// default test
		testSubject = createTestSubject();
		result = testSubject.add(a, b);
		assertEquals(expected, result);
	}

	@Test
	public void testSub() throws Exception {
		calculaotor testSubject;
		int a = 1;
		int b = 2;
		int result;
		int expected = -1;

		// default test
		testSubject = createTestSubject();
		result = testSubject.sub(a, b);
		assertEquals(expected, result);
	}

	@Test
	public void testMul() throws Exception {
		calculaotor testSubject;
		int a = 1;
		int b = 2;
		int result;
		int expected = 2;

		// default test
		testSubject = createTestSubject();
		result = testSubject.mul(a, b);
		assertEquals(expected, result);
	}

	@Test
	public void testDiv() throws Exception {
		calculaotor testSubject;
		int a = 2;
		int b = 2;
		int result;
		int expected = 1;

		// default test
		testSubject = createTestSubject();
		result = testSubject.div(a, b);
		assertEquals(expected, result);
	}
}