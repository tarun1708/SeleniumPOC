package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import screenModule.SignInAction;
import utility.ConstantUtility;
import utility.ExcelUtils;

public class PageObjectModel {

	private static WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() throws Exception
	{
		System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
		//ExcelUtils.setExcelFile(ConstantUtility.filePath+ConstantUtility.fileName,"LoginSheet");
		driver = new FirefoxDriver();
		driver.get(ConstantUtility.URL);

		
	}
	
	@Test
	public void main() throws Exception {
		
		
		// Launch the Online Store Website
		
		SignInAction.execute(driver);
		
		System.out.println("Login Successfully on website www.volercars.com");

		// Wait for 5 Sec
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Close the driver
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.quit();
		
		//ExcelUtils.setResult("Pass", 1,3);
		
	}
}
