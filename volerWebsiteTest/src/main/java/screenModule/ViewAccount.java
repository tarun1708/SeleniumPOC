package screenModule;

import org.openqa.selenium.WebDriver;

import volerWebElement.MyAccountElement;
import volerWebElement.TopHeaderElement;

public class ViewAccount {

	public static void execute(WebDriver driver) {
		TopHeaderElement.clickMyAccount(driver).click();
		TopHeaderElement.viewMyAccount(driver).click();
		editPersonalDetails(driver);
		changePassword(driver);
		System.out.println("clicked on my account");
	}

	private static void editPersonalDetails(WebDriver driver) {
		MyAccountElement.editDetailsElement(driver);
		System.out.println("clicked on edit personal details");
		MyAccountElement.editDetailsBackElement(driver);
		System.out.println("clicked on back button");
	}
	private static void verifyPersonalDetails(WebDriver driver) {
		//MyAccountElement.changePasswordElement(driver);
		System.out.println("verify personal details");
		
	}

	private static void changePassword(WebDriver driver) {
		MyAccountElement.changePasswordElement(driver);
		System.out.println("clicked on change password ");
	}

}
