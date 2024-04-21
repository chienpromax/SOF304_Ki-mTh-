package poly.edu.vn.lab6;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamtersTeting {
  @Parameters({"BrowserName"})
  @Test
  public void OpenBrowser(String BrowserName) {
	  System.out.println("Browser passed as: " + BrowserName);
  }
  @Parameters({"Username","Pass"})
  @Test
  public void login(String Username, String Pass) {
	  System.out.println("Username as: " + Username);
	  System.out.println("Password as: " + Pass);
  }
}
