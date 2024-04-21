package poly.edu.vn.lab6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestNGFile {
    public String baseUrl = "https://lms.poly.edu.vn/";
//	String driverPath ="C:\\Program Files\\Google\\Chrome\\Application\\Chrome.exe";
    public WebDriver driver;
    
    @BeforeTest
    public void launchBrowser() throws InterruptedException {
        System.out.println("launching chrome browser");
//        System.setProperty("web/driver.chrome.driver", driverPath);
        WebDriverManager.chromiumdriver().setup();
        driver = new ChromeDriver();
        driver.get(baseUrl);
        Thread.sleep(100);
    }
    
    @Test
    public void verifyHomepageTitle() {
        String expectedTitle = "FPT Polytechnic";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterTest
    public void terminateBrowser() {
        driver.close();
    }
}

