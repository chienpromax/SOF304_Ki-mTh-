package fpoly.edu.vn.BaiLab3;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitMessageTest {
public String message = "Fpoly exception";

	JunitMessage junitmessage = new JunitMessage(message); 
	 
	@Test
	public void testJunitMessage() throws Exception{
		System.out.println("fpoly junit message exception is printing");
		junitmessage.printHiMessage();
	}

	@Test
	public void testJunitHiMessage() {
		message = "Hi" + message;
		System.out.println("Fpoly Junit Message is printing");
		assertEquals(message, junitmessage.printHiMessage());
	}


}
