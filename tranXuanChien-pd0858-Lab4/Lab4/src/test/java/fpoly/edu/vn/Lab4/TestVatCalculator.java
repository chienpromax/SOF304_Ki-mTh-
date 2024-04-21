package fpoly.edu.vn.Lab4;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.*;


public class TestVatCalculator {

	@Test
	public void testGetVatOnAmount() {
		VatCaculator calc = new VatCaculator();
		double expected = 10;
		Assert.assertEquals( calc.getVatOnAmount(100), expected);
//		Assert.assertNotEquals( calc.getVatOnAmount(120), expected);
	}
	@Test
	public void testGetVatOnAmount2() {
		VatCaculator calc = new VatCaculator();
		double expected = 10;
//		Assert.assertEquals( calc.getVatOnAmount(100), expected);
		Assert.assertNotEquals( calc.getVatOnAmount(100), expected);
	}
}
