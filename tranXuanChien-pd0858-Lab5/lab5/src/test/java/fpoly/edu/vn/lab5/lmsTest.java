package fpoly.edu.vn.lab5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lmsTest {
	@Test
	public void testLMS() throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://lms.poly.edu.vn/";
        String title_website = "Hệ thống quản trị học tâp Fpt polytechnic";
        
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application");
        driver.get(url);
        Thread.sleep(1000);
        String title_expected = driver.getTitle();

        if (title_expected.equals(title_website)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test fail");
        }

        driver.close();
    }
}
