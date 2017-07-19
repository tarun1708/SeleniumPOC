package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import screenModule.SignInAction;
import screenModule.ViewAccount;
import utility.ConstantUtility;

public class PageObjectModel {

	private static WebDriver driver = null;

	@BeforeSuite
	public void beforeMethod() throws Exception {
		System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
		// ExcelUtils.setExcelFile(ConstantUtility.filePath+ConstantUtility.fileName,"LoginSheet");
		driver = new FirefoxDriver();
		driver.get(ConstantUtility.URL);

	}

	@Test
	public void loginTest() throws Exception {

		String token = SignInAction.execute(driver);

		System.out.println("finally token is " + token);
	
		// Wait for 5 Sec
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void myAccountTest() throws Exception {
		ViewAccount.execute(driver);
		System.out.println("My account done");
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterSuite
	public void afterMethod() {
		driver.quit();

		// ExcelUtils.setResult("Pass", 1,3);

	}
}
