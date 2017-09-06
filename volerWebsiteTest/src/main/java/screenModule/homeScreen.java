package screenModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import volerWebElement.MyAccountElement;
import volerWebElement.TopHeaderElement;

public class homeScreen {

	public static void execute(WebDriver driver) {
		WebElement element= TopHeaderElement.changeCity(driver);
		Select select=new Select(element);
		select.selectByValue("Bengaluru");
		System.out.println("Selected city :"+select.toString());
	}

	private static void changeCity(WebDriver driver) {
		MyAccountElement.editDetailsElement(driver);
		System.out.println("clicked on edit personal details");
		MyAccountElement.editDetailsBackElement(driver);
		System.out.println("clicked on back button");
	}

}
