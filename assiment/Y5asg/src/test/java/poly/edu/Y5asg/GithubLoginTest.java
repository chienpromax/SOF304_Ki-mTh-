package poly.edu.Y5asg;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GithubLoginTest {
    private String Url = "https://github.com/login";
    WebDriver driver = null;

    @BeforeTest
    public void setUp() {
        // Set up Edge browser
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    @Test
    public void testGithubLoginTest() throws InterruptedException {
        // Navigate to GitHub login page
        driver.manage().window().maximize();
        driver.get(Url);

        // Enter username and password
        WebElement email = driver.findElement(By.id("login_field"));
        WebElement password = driver.findElement(By.id("password"));
        email.sendKeys("");
        password.sendKeys("");
        
        // Submit login request
        password.submit();

        // Wait for the dashboard page to load after login
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement dashboardTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Dashboard')]")));

        // Assertion to verify successful login
        Assert.assertTrue(dashboardTitle.isDisplayed(), "lỗi");

        // Display success message
        System.out.println("Login ok");
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        driver.close();
    }
}