package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import screenModule.AdminScreen;
import screenModule.SavedAddressScreen;
import screenModule.SignInAction;
import screenModule.ViewAccount;
import screenModule.homeScreen;
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
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(enabled=true,priority=0)
	public void savedAddressTest() throws Exception {
		SavedAddressScreen.execute(driver);
		System.out.println("address done");
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority=1,enabled=true)
	public void updateAddressTest() throws Exception {
		SavedAddressScreen.update(driver);
		System.out.println("update address done");
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority=2,enabled=true)
	public void deleteAddressTest() throws Exception {
		SavedAddressScreen.delete(driver);
		System.out.println("address delete done");
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*@Test(enabled = false)
	public void homePageTest() throws Exception {
		homeScreen.execute(driver);
		System.out.println("city change");
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(enabled = false)
	public void inventoryTest() throws Exception {
		AdminScreen.execute(driver);
		System.out.println("city change");
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	@AfterSuite
	public void afterMethod() {
		driver.quit();

		// ExcelUtils.setResult("Pass", 1,3);

	}
}
