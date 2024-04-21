package fpoly.edu.vn.lab5;

import org.testng.annotations.Test;

public class TestGroup {
  @Test(groups = "Regression")
  public void TestCase1() {
	  System.out.println("test case 1 Regression");
  }
  @Test(groups = "Regression")
  public void TestCase2() {
	  System.out.println("test case 2 Regression");
  }
  @Test(groups = "Smoke Test")
  public void TestCase3() {
	  System.out.println("test case 3 Smoke Test");
  }
  @Test(groups = "Regression")
  public void TestCase4() {
	  System.out.println("test case 4 Regression");
  }
}
