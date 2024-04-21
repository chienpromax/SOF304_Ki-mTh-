package poly.edu.vn.Lab7;

import org.testng.Assert;
import org.testng.ITest;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryInstantiatedTestclass implements ITest{
	private String param;

	public FactoryInstantiatedTestclass(String param) {
		this.param = param;
	}

	public String getTestName() {
		return getClass().getSimpleName() + "-" + param;
	}

	@Factory
  public static Object[] create() {
	  return new Object[] {new FactoryInstantiatedTestclass("testNG"),
		new FactoryInstantiatedTestclass("Reports")};
	}
	@Test
	public void f() {
		if (param.equals("Reports")) {
			Assert.assertTrue(true);
		}
	}
}
