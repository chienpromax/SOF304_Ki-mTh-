package fpoly.edu.vn.lab2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitAnnotations {
	
	private ArrayList<String> list;
	
	@BeforeClass
	public static void m1() {
		System.out.println("Sử dụng @BeforeClass,"
				+ " được thực thi trước tất cả các trường hợp thử nghiệm");
	}
	@Before
	public void m2() {
		list = new ArrayList<String>();
		System.out.println("Sử dụng @before, được thực thi trước mỗi trường hợp kiểm thử");
	}
	@AfterClass
	public static void m3() {
		System.out.println("Sử dụng @AfterClass, được thực thi Sau tất cả các trường hợp thử nghiệm");
	}
	@After
	public void m4() {
		System.out.println("Sử dụng @After, được thực thi Sau mỗi trường hợp kiểm thử");
	}

	@Test
	public void m5() {
		list.add("test");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
	}
	
	@Ignore
	public void m6() {
		System.out.println("Sử dụng @Ignore, việc thực thi này bị bỏ qua");
	}
	
	@Test(timeout = 10)
	public void m7(){
		System.out.println("Using @Test(timeout)");
	}
	
	@Test(expected = NoSuchMethodException.class)
	public void m8() throws NoSuchMethodException{
		System.out.println("Sử dụng @Test(expected),"
				+ " nó sẽ kiểm tra ngoại lệ cụ thể trong quá trình thực thi.");
		throw new NoSuchMethodException();
	}

}
