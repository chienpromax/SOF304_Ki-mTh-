package fpoly.edu.vn.lab2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SuiteTest1 {
	public String message = "Fpoly";
	
	JUnitMessage jUnitMessage = new JUnitMessage(message);
	
	@Test(expected = ArithmeticException.class)
	public void testMesage(){
		System.out.println("Junit Masage đang in");
		jUnitMessage.printMessage();
	}
	@Test
	public void testJUnitHIMessage(){
		message = "HI! " + message;
		System.out.println(message);
		assertEquals(message, jUnitMessage.printHiMessage());
		System.out.println("suite test 2 is successful ");
	}
}
