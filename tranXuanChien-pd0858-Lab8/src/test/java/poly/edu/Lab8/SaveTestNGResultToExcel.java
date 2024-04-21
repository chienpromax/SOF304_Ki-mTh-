package poly.edu.Lab8;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SaveTestNGResultToExcel {
	public WebDriver driver;
	public UIMap uimap;
	public UIMap datafile;
	public String workingDir;
	HSSFWorkbook workbook;
	HSSFSheet worksheet;
	Map<String, Object[]> TestNGResults;

	@Test(description = "Opens the TestNG Demo Website for login Test", priority = 1)
	public void LaunchWebsite() throws Exception {
		try {
			driver.get("http://phptravels.net/login");
			driver.manage().window().maximize();
			TestNGResults.put("2", new Object[] { 1d, "Navigate demo website", "Site gets opened", "Passed" });
		} catch (Exception e) {
			TestNGResults.put("2", new Object[] { 1d, "Navigate demo website", "Site gets opened", "Failed" });
			AssertJUnit.assertTrue(false);
		}
	}

	@Test(description = "Fill the Login Details", priority = 2)
	public void FillLoginDetails() throws Exception {
		try {
			// Get the username element
			WebElement username = driver.findElement(uimap.getLocator("Username_field"));
			username.sendKeys(datafile.getData("username"));
			// Get the password element
			WebElement password = driver.findElement(uimap.getLocator("Password_field"));
			password.sendKeys(datafile.getData("password"));
			Thread.sleep(1000);
			TestNGResults.put("3", new Object[] { 2d, "Fill Login form data", "Login details gets Filled", "Passed" });
		} catch (Exception e) {
			TestNGResults.put("3", new Object[] { 2d, "Fill Login form data", "Login details gets Filled", "Failed" });
			AssertJUnit.assertTrue(false);
		}
	}

	@Test(description = "Perform Login", priority = 3)
	public void DoLogin() throws Exception {
		try {
			// Nhấn vào nút login
			WebElement login = driver.findElement(By.cssSelector("button[type=submit]"));
			Actions actions = new Actions(driver).click(login);
			actions.build().perform();
			Thread.sleep(1000);
			TestNGResults.put("4", new Object[] { 3d, "Click Login and verify massage", "Login success", "Passed" });
		} catch (Exception e) {
			e.printStackTrace();
			TestNGResults.put("4", new Object[] { 3d, "Click Login and verify massage", "Login unsuccess", "Failed" });
			Assert.assertTrue(false);
		}
	}

	@SuppressWarnings("deprecation")
	@BeforeClass(alwaysRun = true)
	public void suiteSetup() {
		workbook = new HSSFWorkbook();
		worksheet = workbook.createSheet("TestNG Result Summary");
		TestNGResults = new LinkedHashMap<String, Object[]>();
		// Thêm test result vào file excel ở cột header
		TestNGResults.put("1", new Object[] { "Test Step No.", "Action", "Expected Output", "Actual Output" });
		try {
			// Lấy địa chỉ làm việc hiện tại và tải dữ liệu vào file
			workingDir = System.getProperty("user.dir");
			datafile = new UIMap(workingDir + "\\Resources\\datafile.properties");
			uimap = new UIMap(workingDir + "\\Resources\\locator.properties");
			// Cài đặt địa chỉ Edge Driver và chạy Edge
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // No Such Element Exception
		} catch (Exception e) {
			throw new IllegalStateException("Can't start the Chrome web driver", e);
		}
	}

	@AfterClass
	public void suiteTearDown() {
		// ghi file excel và tên file là SaveTestNGResultToExcel.xls
		Set<String> keyset = TestNGResults.keySet();
		int rownum = 0;
		for (String key : keyset) {
			Row row = worksheet.createRow(rownum++);
			Object[] objArr = TestNGResults.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				Cell cell = row.createCell(cellnum++);
				if (obj instanceof Date) {
					cell.setCellValue((Date) obj);
				} else if (obj instanceof Boolean) {
					cell.setCellValue((Boolean) obj);
				} else if (obj instanceof String) {
					cell.setCellValue((String) obj);
				} else if (obj instanceof Double) {
					cell.setCellValue((Double) obj);
				}
			}
			try {
				FileOutputStream out = new FileOutputStream(new File("SaveTestNGResultToExcel.xls"));
				workbook.write(out);
				out.close();
				System.out.println("Successfully save Selenium Webdriver TestNG result to Excel File!!!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		driver.close();
		driver.quit();
	}
}
