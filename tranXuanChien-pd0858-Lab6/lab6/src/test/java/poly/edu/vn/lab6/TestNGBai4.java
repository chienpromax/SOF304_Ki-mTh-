package poly.edu.vn.lab6;

import org.testng.annotations.Test;

public class TestNGBai4 {
  @Test
  public void registerAccount() {
	  System.out.println("1 đăng kí ");
  }
  @Test(priority = 2)
  public void sendmail() {
	  System.out.println("3 gửi mail ");
  }
  @Test(priority = 1)
  public void login() {
	  System.out.println("2 đăng nhập");
  }
}
