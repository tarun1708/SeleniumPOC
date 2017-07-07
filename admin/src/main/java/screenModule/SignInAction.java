package screenModule;

import org.openqa.selenium.WebDriver;

import admin.home;
import admin.login;
import utility.ConstantUtility;
import utility.ExcelUtils;

public class SignInAction {

	public static void execute(WebDriver driver) throws Exception {
	//	String excelUserName = ExcelUtils.getCellData(1, 1);
		//String excelPassword = ExcelUtils.getCellData(1, 2);

		home.myAccount(driver).click();
		//login.userName(driver).sendKeys(excelUserName);
		//login.password(driver).sendKeys(excelPassword);
		login.userName(driver).sendKeys(ConstantUtility.username);
		login.password(driver).sendKeys(ConstantUtility.password);
		
		login.loginbutton(driver).click();

	}
}
